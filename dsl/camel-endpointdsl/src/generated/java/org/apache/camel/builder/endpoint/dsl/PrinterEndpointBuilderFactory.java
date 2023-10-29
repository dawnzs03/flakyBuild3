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
 * Send print jobs to printers.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PrinterEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Printer component.
     */
    public interface PrinterEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedPrinterEndpointBuilder advanced() {
            return (AdvancedPrinterEndpointBuilder) this;
        }
        /**
         * Number of copies to print.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: producer
         * 
         * @param copies the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder copies(int copies) {
            doSetProperty("copies", copies);
            return this;
        }
        /**
         * Number of copies to print.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: producer
         * 
         * @param copies the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder copies(String copies) {
            doSetProperty("copies", copies);
            return this;
        }
        /**
         * Sets DocFlavor to use.
         * 
         * The option is a: &lt;code&gt;javax.print.DocFlavor&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param docFlavor the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder docFlavor(javax.print.DocFlavor docFlavor) {
            doSetProperty("docFlavor", docFlavor);
            return this;
        }
        /**
         * Sets DocFlavor to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;javax.print.DocFlavor&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param docFlavor the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder docFlavor(String docFlavor) {
            doSetProperty("docFlavor", docFlavor);
            return this;
        }
        /**
         * Sets DocFlavor to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param flavor the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder flavor(String flavor) {
            doSetProperty("flavor", flavor);
            return this;
        }
        /**
         * Sets the stationary as defined by enumeration names in the
         * javax.print.attribute.standard.MediaSizeName API. The default setting
         * is to use North American Letter sized stationary. The value's case is
         * ignored, e.g. values of iso_a4 and ISO_A4 may be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: na-letter
         * Group: producer
         * 
         * @param mediaSize the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder mediaSize(String mediaSize) {
            doSetProperty("mediaSize", mediaSize);
            return this;
        }
        /**
         * Sets MediaTray supported by the javax.print.DocFlavor API, for
         * example upper,middle etc.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param mediaTray the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder mediaTray(String mediaTray) {
            doSetProperty("mediaTray", mediaTray);
            return this;
        }
        /**
         * Sets mimeTypes supported by the javax.print.DocFlavor API.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param mimeType the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder mimeType(String mimeType) {
            doSetProperty("mimeType", mimeType);
            return this;
        }
        /**
         * Sets the page orientation.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: portrait
         * Group: producer
         * 
         * @param orientation the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder orientation(String orientation) {
            doSetProperty("orientation", orientation);
            return this;
        }
        /**
         * Sets the prefix name of the printer, it is useful when the printer
         * name does not start with //hostname/printer.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param printerPrefix the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder printerPrefix(String printerPrefix) {
            doSetProperty("printerPrefix", printerPrefix);
            return this;
        }
        /**
         * etting this option to false prevents sending of the print data to the
         * printer.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param sendToPrinter the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder sendToPrinter(boolean sendToPrinter) {
            doSetProperty("sendToPrinter", sendToPrinter);
            return this;
        }
        /**
         * etting this option to false prevents sending of the print data to the
         * printer.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param sendToPrinter the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder sendToPrinter(String sendToPrinter) {
            doSetProperty("sendToPrinter", sendToPrinter);
            return this;
        }
        /**
         * Sets one sided or two sided printing based on the
         * javax.print.attribute.standard.Sides API.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: one-sided
         * Group: producer
         * 
         * @param sides the value to set
         * @return the dsl builder
         */
        default PrinterEndpointBuilder sides(String sides) {
            doSetProperty("sides", sides);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Printer component.
     */
    public interface AdvancedPrinterEndpointBuilder
            extends
                EndpointProducerBuilder {
        default PrinterEndpointBuilder basic() {
            return (PrinterEndpointBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedPrinterEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedPrinterEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface PrinterBuilders {
        /**
         * Printer (camel-printer)
         * Send print jobs to printers.
         * 
         * Category: document
         * Since: 2.1
         * Maven coordinates: org.apache.camel:camel-printer
         * 
         * @return the dsl builder for the headers' name.
         */
        default PrinterHeaderNameBuilder lpr() {
            return PrinterHeaderNameBuilder.INSTANCE;
        }
        /**
         * Printer (camel-printer)
         * Send print jobs to printers.
         * 
         * Category: document
         * Since: 2.1
         * Maven coordinates: org.apache.camel:camel-printer
         * 
         * Syntax: <code>lpr:hostname:port/printername</code>
         * 
         * Path parameter: hostname (required)
         * Hostname of the printer
         * 
         * Path parameter: port
         * Port number of the printer
         * 
         * Path parameter: printername
         * Name of the printer
         * 
         * @param path hostname:port/printername
         * @return the dsl builder
         */
        default PrinterEndpointBuilder lpr(String path) {
            return PrinterEndpointBuilderFactory.endpointBuilder("lpr", path);
        }
        /**
         * Printer (camel-printer)
         * Send print jobs to printers.
         * 
         * Category: document
         * Since: 2.1
         * Maven coordinates: org.apache.camel:camel-printer
         * 
         * Syntax: <code>lpr:hostname:port/printername</code>
         * 
         * Path parameter: hostname (required)
         * Hostname of the printer
         * 
         * Path parameter: port
         * Port number of the printer
         * 
         * Path parameter: printername
         * Name of the printer
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path hostname:port/printername
         * @return the dsl builder
         */
        default PrinterEndpointBuilder lpr(String componentName, String path) {
            return PrinterEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Printer component.
     */
    public static class PrinterHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final PrinterHeaderNameBuilder INSTANCE = new PrinterHeaderNameBuilder();

        /**
         * The name of the job.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PrinterJobName}.
         */
        public String printerJobName() {
            return "PrinterJobName";
        }
    }
    static PrinterEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class PrinterEndpointBuilderImpl extends AbstractEndpointBuilder implements PrinterEndpointBuilder, AdvancedPrinterEndpointBuilder {
            public PrinterEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new PrinterEndpointBuilderImpl(path);
    }
}