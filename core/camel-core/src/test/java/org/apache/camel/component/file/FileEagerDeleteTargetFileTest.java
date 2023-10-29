/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.file;

import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileEagerDeleteTargetFileTest extends ContextTestSupport {

    @Override
    @BeforeEach
    public void setUp() throws Exception {
        super.setUp();
        template.sendBodyAndHeader(fileUri(), "Hello World", Exchange.FILE_NAME, "world.txt");
    }

    @Test
    public void testEagerDeleteTargetFileTrue() throws Exception {
        template.sendBodyAndHeader(
                fileUri("?tempFileName=inprogress-${file:name}&eagerDeleteTargetFile=true"),
                "Bye World",
                Exchange.FILE_NAME, "world.txt");

        Path file = testFile("world.txt");
        assertTrue(Files.exists(file), "File should exist");
        assertEquals("Bye World", new String(Files.readAllBytes(file)));
    }

    @Test
    public void testEagerDeleteTargetFileFalse() throws Exception {
        template.sendBodyAndHeader(
                fileUri("?tempFileName=inprogress-${file:name}&eagerDeleteTargetFile=false"),
                "Bye World",
                Exchange.FILE_NAME, "world.txt");

        Path file = testFile("world.txt");
        assertTrue(Files.exists(file), "File should exist");
        assertEquals("Bye World", new String(Files.readAllBytes(file)));
    }

    @Test
    public void testEagerDeleteTargetFileDefault() throws Exception {
        template.sendBodyAndHeader(
                fileUri("?tempFileName=inprogress-${file:name}"),
                "Bye World",
                Exchange.FILE_NAME, "world.txt");

        Path file = testFile("world.txt");
        assertTrue(Files.exists(file), "File should exist");
        assertEquals("Bye World", new String(Files.readAllBytes(file)));
    }

}
