/*
 * Copyright (c) 2022, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
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

package jdk.internal.classfile.attribute;

import java.util.List;

import jdk.internal.classfile.Annotation;
import jdk.internal.classfile.Attribute;
import jdk.internal.classfile.MethodElement;
import jdk.internal.classfile.MethodModel;
import jdk.internal.classfile.impl.BoundAttribute;
import jdk.internal.classfile.impl.UnboundAttribute;

/**
 * Models the {@code RuntimeInvisibleParameterAnnotations} attribute
 * {@jvms 4.7.19}, which can appear on methods. Delivered as a {@link
 * jdk.internal.classfile.MethodElement} when traversing a {@link MethodModel}.
 */
public sealed interface RuntimeInvisibleParameterAnnotationsAttribute
        extends Attribute<RuntimeInvisibleParameterAnnotationsAttribute>, MethodElement
        permits BoundAttribute.BoundRuntimeInvisibleParameterAnnotationsAttribute,
                UnboundAttribute.UnboundRuntimeInvisibleParameterAnnotationsAttribute {

    /**
     * {@return the list of annotations corresponding to each method parameter}
     * The element at the i'th index corresponds to the annotations on the i'th
     * parameter.
     */
    List<List<Annotation>> parameterAnnotations();

    /**
     * {@return a {@code RuntimeInvisibleParameterAnnotations} attribute}
     * @param parameterAnnotations a list of parameter annotations for each parameter
     */
    static RuntimeInvisibleParameterAnnotationsAttribute of(List<List<Annotation>> parameterAnnotations) {
        return new UnboundAttribute.UnboundRuntimeInvisibleParameterAnnotationsAttribute(parameterAnnotations);
    }
}
