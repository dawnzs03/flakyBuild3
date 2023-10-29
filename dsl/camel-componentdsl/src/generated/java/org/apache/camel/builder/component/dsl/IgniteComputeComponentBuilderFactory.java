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
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.ignite.compute.IgniteComputeComponent;

/**
 * Run compute operations on an Ignite cluster.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface IgniteComputeComponentBuilderFactory {

    /**
     * Ignite Compute (camel-ignite)
     * Run compute operations on an Ignite cluster.
     * 
     * Category: cache,clustering
     * Since: 2.17
     * Maven coordinates: org.apache.camel:camel-ignite
     * 
     * @return the dsl builder
     */
    static IgniteComputeComponentBuilder igniteCompute() {
        return new IgniteComputeComponentBuilderImpl();
    }

    /**
     * Builder for the Ignite Compute component.
     */
    interface IgniteComputeComponentBuilder
            extends
                ComponentBuilder<IgniteComputeComponent> {
        /**
         * The resource from where to load the configuration. It can be a: URL,
         * String or InputStream type.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configurationResource the value to set
         * @return the dsl builder
         */
        default IgniteComputeComponentBuilder configurationResource(
                java.lang.Object configurationResource) {
            doSetProperty("configurationResource", configurationResource);
            return this;
        }
        /**
         * To use an existing Ignite instance.
         * 
         * The option is a: &lt;code&gt;org.apache.ignite.Ignite&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param ignite the value to set
         * @return the dsl builder
         */
        default IgniteComputeComponentBuilder ignite(
                org.apache.ignite.Ignite ignite) {
            doSetProperty("ignite", ignite);
            return this;
        }
        /**
         * Allows the user to set a programmatic ignite configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.ignite.configuration.IgniteConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param igniteConfiguration the value to set
         * @return the dsl builder
         */
        default IgniteComputeComponentBuilder igniteConfiguration(
                org.apache.ignite.configuration.IgniteConfiguration igniteConfiguration) {
            doSetProperty("igniteConfiguration", igniteConfiguration);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default IgniteComputeComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default IgniteComputeComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    }

    class IgniteComputeComponentBuilderImpl
            extends
                AbstractComponentBuilder<IgniteComputeComponent>
            implements
                IgniteComputeComponentBuilder {
        @Override
        protected IgniteComputeComponent buildConcreteComponent() {
            return new IgniteComputeComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configurationResource": ((IgniteComputeComponent) component).setConfigurationResource((java.lang.Object) value); return true;
            case "ignite": ((IgniteComputeComponent) component).setIgnite((org.apache.ignite.Ignite) value); return true;
            case "igniteConfiguration": ((IgniteComputeComponent) component).setIgniteConfiguration((org.apache.ignite.configuration.IgniteConfiguration) value); return true;
            case "lazyStartProducer": ((IgniteComputeComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((IgniteComputeComponent) component).setAutowiredEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}