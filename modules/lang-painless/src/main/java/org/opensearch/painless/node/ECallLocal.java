/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.painless.node;

import org.opensearch.painless.Location;
import org.opensearch.painless.phase.UserTreeVisitor;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Represents a user-defined call.
 */
public class ECallLocal extends AExpression {

    private final String methodName;
    private final List<AExpression> argumentNodes;

    public ECallLocal(int identifier, Location location, String methodName, List<AExpression> argumentNodes) {
        super(identifier, location);

        this.methodName = Objects.requireNonNull(methodName);
        this.argumentNodes = Collections.unmodifiableList(Objects.requireNonNull(argumentNodes));
    }

    public String getMethodName() {
        return methodName;
    }

    public List<AExpression> getArgumentNodes() {
        return argumentNodes;
    }

    @Override
    public <Scope> void visit(UserTreeVisitor<Scope> userTreeVisitor, Scope scope) {
        userTreeVisitor.visitCallLocal(this, scope);
    }

    @Override
    public <Scope> void visitChildren(UserTreeVisitor<Scope> userTreeVisitor, Scope scope) {
        for (AExpression argumentNode : argumentNodes) {
            argumentNode.visit(userTreeVisitor, scope);
        }
    }
}
