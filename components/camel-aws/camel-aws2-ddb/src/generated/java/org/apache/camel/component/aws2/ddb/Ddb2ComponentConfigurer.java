/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.ddb;

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
public class Ddb2ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.aws2.ddb.Ddb2Configuration getOrCreateConfiguration(Ddb2Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws2.ddb.Ddb2Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Ddb2Component target = (Ddb2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonddbclient":
        case "amazonDDBClient": getOrCreateConfiguration(target).setAmazonDDBClient(property(camelContext, software.amazon.awssdk.services.dynamodb.DynamoDbClient.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws2.ddb.Ddb2Configuration.class, value)); return true;
        case "consistentread":
        case "consistentRead": getOrCreateConfiguration(target).setConsistentRead(property(camelContext, boolean.class, value)); return true;
        case "enabledinitialdescribetable":
        case "enabledInitialDescribeTable": getOrCreateConfiguration(target).setEnabledInitialDescribeTable(property(camelContext, boolean.class, value)); return true;
        case "keyattributename":
        case "keyAttributeName": getOrCreateConfiguration(target).setKeyAttributeName(property(camelContext, java.lang.String.class, value)); return true;
        case "keyattributetype":
        case "keyAttributeType": getOrCreateConfiguration(target).setKeyAttributeType(property(camelContext, java.lang.String.class, value)); return true;
        case "keyscalartype":
        case "keyScalarType": getOrCreateConfiguration(target).setKeyScalarType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.aws2.ddb.Ddb2Operations.class, value)); return true;
        case "overrideendpoint":
        case "overrideEndpoint": getOrCreateConfiguration(target).setOverrideEndpoint(property(camelContext, boolean.class, value)); return true;
        case "profilecredentialsname":
        case "profileCredentialsName": getOrCreateConfiguration(target).setProfileCredentialsName(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "readcapacity":
        case "readCapacity": getOrCreateConfiguration(target).setReadCapacity(property(camelContext, java.lang.Long.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": getOrCreateConfiguration(target).setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
        case "uriendpointoverride":
        case "uriEndpointOverride": getOrCreateConfiguration(target).setUriEndpointOverride(property(camelContext, java.lang.String.class, value)); return true;
        case "usedefaultcredentialsprovider":
        case "useDefaultCredentialsProvider": getOrCreateConfiguration(target).setUseDefaultCredentialsProvider(property(camelContext, boolean.class, value)); return true;
        case "useprofilecredentialsprovider":
        case "useProfileCredentialsProvider": getOrCreateConfiguration(target).setUseProfileCredentialsProvider(property(camelContext, boolean.class, value)); return true;
        case "writecapacity":
        case "writeCapacity": getOrCreateConfiguration(target).setWriteCapacity(property(camelContext, java.lang.Long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"amazonDDBClient"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "amazonddbclient":
        case "amazonDDBClient": return software.amazon.awssdk.services.dynamodb.DynamoDbClient.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "configuration": return org.apache.camel.component.aws2.ddb.Ddb2Configuration.class;
        case "consistentread":
        case "consistentRead": return boolean.class;
        case "enabledinitialdescribetable":
        case "enabledInitialDescribeTable": return boolean.class;
        case "keyattributename":
        case "keyAttributeName": return java.lang.String.class;
        case "keyattributetype":
        case "keyAttributeType": return java.lang.String.class;
        case "keyscalartype":
        case "keyScalarType": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return org.apache.camel.component.aws2.ddb.Ddb2Operations.class;
        case "overrideendpoint":
        case "overrideEndpoint": return boolean.class;
        case "profilecredentialsname":
        case "profileCredentialsName": return java.lang.String.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return software.amazon.awssdk.core.Protocol.class;
        case "readcapacity":
        case "readCapacity": return java.lang.Long.class;
        case "region": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "trustallcertificates":
        case "trustAllCertificates": return boolean.class;
        case "uriendpointoverride":
        case "uriEndpointOverride": return java.lang.String.class;
        case "usedefaultcredentialsprovider":
        case "useDefaultCredentialsProvider": return boolean.class;
        case "useprofilecredentialsprovider":
        case "useProfileCredentialsProvider": return boolean.class;
        case "writecapacity":
        case "writeCapacity": return java.lang.Long.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Ddb2Component target = (Ddb2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazonddbclient":
        case "amazonDDBClient": return getOrCreateConfiguration(target).getAmazonDDBClient();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "configuration": return target.getConfiguration();
        case "consistentread":
        case "consistentRead": return getOrCreateConfiguration(target).isConsistentRead();
        case "enabledinitialdescribetable":
        case "enabledInitialDescribeTable": return getOrCreateConfiguration(target).isEnabledInitialDescribeTable();
        case "keyattributename":
        case "keyAttributeName": return getOrCreateConfiguration(target).getKeyAttributeName();
        case "keyattributetype":
        case "keyAttributeType": return getOrCreateConfiguration(target).getKeyAttributeType();
        case "keyscalartype":
        case "keyScalarType": return getOrCreateConfiguration(target).getKeyScalarType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "overrideendpoint":
        case "overrideEndpoint": return getOrCreateConfiguration(target).isOverrideEndpoint();
        case "profilecredentialsname":
        case "profileCredentialsName": return getOrCreateConfiguration(target).getProfileCredentialsName();
        case "proxyhost":
        case "proxyHost": return getOrCreateConfiguration(target).getProxyHost();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return getOrCreateConfiguration(target).getProxyProtocol();
        case "readcapacity":
        case "readCapacity": return getOrCreateConfiguration(target).getReadCapacity();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "trustallcertificates":
        case "trustAllCertificates": return getOrCreateConfiguration(target).isTrustAllCertificates();
        case "uriendpointoverride":
        case "uriEndpointOverride": return getOrCreateConfiguration(target).getUriEndpointOverride();
        case "usedefaultcredentialsprovider":
        case "useDefaultCredentialsProvider": return getOrCreateConfiguration(target).isUseDefaultCredentialsProvider();
        case "useprofilecredentialsprovider":
        case "useProfileCredentialsProvider": return getOrCreateConfiguration(target).isUseProfileCredentialsProvider();
        case "writecapacity":
        case "writeCapacity": return getOrCreateConfiguration(target).getWriteCapacity();
        default: return null;
        }
    }
}

