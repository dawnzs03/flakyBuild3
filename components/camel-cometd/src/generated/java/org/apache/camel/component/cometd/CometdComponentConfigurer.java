/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cometd;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CometdComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CometdComponent target = (CometdComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "extensions": target.setExtensions(property(camelContext, java.util.List.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "securitypolicy":
        case "securityPolicy": target.setSecurityPolicy(property(camelContext, org.cometd.bayeux.server.SecurityPolicy.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslkeypassword":
        case "sslKeyPassword": target.setSslKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystore":
        case "sslKeystore": target.setSslKeystore(property(camelContext, java.lang.String.class, value)); return true;
        case "sslpassword":
        case "sslPassword": target.setSslPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "extensions": return java.util.List.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "securitypolicy":
        case "securityPolicy": return org.cometd.bayeux.server.SecurityPolicy.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "sslkeypassword":
        case "sslKeyPassword": return java.lang.String.class;
        case "sslkeystore":
        case "sslKeystore": return java.lang.String.class;
        case "sslpassword":
        case "sslPassword": return java.lang.String.class;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CometdComponent target = (CometdComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "extensions": return target.getExtensions();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "securitypolicy":
        case "securityPolicy": return target.getSecurityPolicy();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "sslkeypassword":
        case "sslKeyPassword": return target.getSslKeyPassword();
        case "sslkeystore":
        case "sslKeystore": return target.getSslKeystore();
        case "sslpassword":
        case "sslPassword": return target.getSslPassword();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "extensions": return org.cometd.bayeux.server.BayeuxServer.Extension.class;
        default: return null;
        }
    }
}

