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
package org.apache.camel.spring.interceptor;

import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactedRecipientListThreadStuckTest extends TransactionClientDataSourceSupport {

    @Test
    @Timeout(value = 10)
    public void testThreadStuck() throws Exception {
        getMockEndpoint("mock:result").expectedBodiesReceived("Bye World", "Bye Camel");

        Object out = template.requestBody("direct:start", "World");
        assertEquals("Bye World", out);
        out = template.requestBody("direct:start", "Camel");
        assertEquals("Bye Camel", out);

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start")
                        .transacted()
                        .log("Start ${threadName}")
                        .recipientList(constant("direct:foo"))
                        .log("End ${threadName}")
                        .to("mock:result");

                from("direct:foo")
                    .delay(1)
                        .transform().simple("Bye ${body}")
                    .end();
            }
        };
    }

}
