/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.servicenow.releases.fuji;

import org.apache.camel.AsyncCallback;
import org.apache.camel.Exchange;
import org.apache.camel.spi.InvokeOnHeaderStrategy;
import org.apache.camel.component.servicenow.releases.fuji.FujiServiceNowProducer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FujiServiceNowProducerInvokeOnHeaderFactory implements InvokeOnHeaderStrategy {

    @Override
    public Object invoke(Object obj, String key, Exchange exchange, AsyncCallback callback) throws Exception {
        org.apache.camel.component.servicenow.releases.fuji.FujiServiceNowProducer target = (org.apache.camel.component.servicenow.releases.fuji.FujiServiceNowProducer) obj;
        switch (key) {
        case "aggregate": target.invokeProcessor2(exchange); return null;
        case "import": target.invokeProcessor3(exchange); return null;
        case "table": target.invokeProcessor1(exchange); return null;
        default: return null;
        }
    }

}

