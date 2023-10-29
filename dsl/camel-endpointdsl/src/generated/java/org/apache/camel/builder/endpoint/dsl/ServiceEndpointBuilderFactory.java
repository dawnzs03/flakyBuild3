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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Register a Camel endpoint to a Service Registry (such as Consul, Etcd) and
 * delegate to it.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ServiceEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Service component.
     */
    public interface ServiceEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedServiceEndpointBuilder advanced() {
            return (AdvancedServiceEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the Service component.
     */
    public interface AdvancedServiceEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default ServiceEndpointBuilder basic() {
            return (ServiceEndpointBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedServiceEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedServiceEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedServiceEndpointBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedServiceEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedServiceEndpointBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedServiceEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    public interface ServiceBuilders {
        /**
         * Service (camel-service)
         * Register a Camel endpoint to a Service Registry (such as Consul,
         * Etcd) and delegate to it.
         * 
         * Category: cloud
         * Since: 2.22
         * Maven coordinates: org.apache.camel:camel-service
         * 
         * Syntax: <code>service:delegateUri</code>
         * 
         * Path parameter: delegateUri (required)
         * The endpoint uri to expose as service
         * 
         * @param path delegateUri
         * @return the dsl builder
         */
        default ServiceEndpointBuilder service(String path) {
            return ServiceEndpointBuilderFactory.endpointBuilder("service", path);
        }
        /**
         * Service (camel-service)
         * Register a Camel endpoint to a Service Registry (such as Consul,
         * Etcd) and delegate to it.
         * 
         * Category: cloud
         * Since: 2.22
         * Maven coordinates: org.apache.camel:camel-service
         * 
         * Syntax: <code>service:delegateUri</code>
         * 
         * Path parameter: delegateUri (required)
         * The endpoint uri to expose as service
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path delegateUri
         * @return the dsl builder
         */
        default ServiceEndpointBuilder service(String componentName, String path) {
            return ServiceEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static ServiceEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class ServiceEndpointBuilderImpl extends AbstractEndpointBuilder implements ServiceEndpointBuilder, AdvancedServiceEndpointBuilder {
            public ServiceEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ServiceEndpointBuilderImpl(path);
    }
}