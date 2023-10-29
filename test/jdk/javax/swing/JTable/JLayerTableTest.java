/*
 * Copyright (c) 2023, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * @test
 * @bug 8166900
 * @key headful
 * @summary  Verifies selection of correct row on VK_PAGE_DOWN
 * @run main JLayerTableTest
 */

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLayer;
import javax.swing.JScrollPane;
import javax.swing.plaf.LayerUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingUtilities;

public class JLayerTableTest {
    static JFrame frame;
    static JTable table;
    static volatile Point tableLoc;
    static volatile Rectangle cellRect;

    static void createUI() {
        frame = new JFrame("JLayer Table Test");
        DefaultTableModel model = new DefaultTableModel() {
            @Override public int getRowCount() {return 100;}
            @Override public int getColumnCount() {return 3;}
            @Override public Object getValueAt(int row, int column) {
                return "(" + row + "," + column + ")";
            }
        };
        table = new JTable(model);
        LayerUI<JComponent> layerUI = new LayerUI<>();
        JLayer<JComponent> layer = new JLayer<>(table, layerUI);
        JScrollPane scrollPane = new JScrollPane(layer);
        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        try {
            SwingUtilities.invokeAndWait(() -> {
                createUI();
            });
            Robot robot = new Robot();
            robot.waitForIdle();
            robot.delay(1000);
            SwingUtilities.invokeAndWait(() -> {
                tableLoc = table.getLocationOnScreen();
                cellRect = table.getCellRect(0, 1, true);
            });
            robot.mouseMove(tableLoc.x + cellRect.x + cellRect.width / 2,
                    tableLoc.y + cellRect.y + cellRect.height / 2);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.waitForIdle();
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            robot.waitForIdle();
            robot.delay(500);
            if (table.getSelectedRow() == (table.getRowCount() - 1)) {
                System.out.println("selected row " + table.getSelectedRow());
                System.out.println("visible row count " + table.getRowCount());
                throw new RuntimeException(
                                    "Cursor is not moved to correct location");
            }
        } finally {
            SwingUtilities.invokeAndWait(() -> {
                if (frame != null) {
                    frame.dispose();
                }
            });
        }
    }
}
