/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.braintreegateway.PaymentMethodGateway}.
 */
@ApiParams(apiName = "paymentMethod", 
           description = "Provides methods to interact with payments",
           apiMethods = {@ApiMethod(methodName = "create", signatures={"com.braintreegateway.Result<com.braintreegateway.? extends PaymentMethod> create(com.braintreegateway.PaymentMethodRequest request)"}), @ApiMethod(methodName = "delete", signatures={"com.braintreegateway.Result<com.braintreegateway.? extends PaymentMethod> delete(String token)", "com.braintreegateway.Result<com.braintreegateway.? extends PaymentMethod> delete(String token, com.braintreegateway.PaymentMethodDeleteRequest request)"}), @ApiMethod(methodName = "find", signatures={"com.braintreegateway.PaymentMethod find(String token)"}), @ApiMethod(methodName = "grant", signatures={"com.braintreegateway.Result<com.braintreegateway.PaymentMethodNonce> grant(String token)", "com.braintreegateway.Result<com.braintreegateway.PaymentMethodNonce> grant(String token, com.braintreegateway.PaymentMethodGrantRequest grantRequest)"}), @ApiMethod(methodName = "revoke", signatures={"com.braintreegateway.Result<com.braintreegateway.? extends PaymentMethod> revoke(String token)"}), @ApiMethod(methodName = "update", signatures={"com.braintreegateway.Result<com.braintreegateway.? extends PaymentMethod> update(String token, com.braintreegateway.PaymentMethodRequest request)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class PaymentMethodGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete")})
    private com.braintreegateway.PaymentMethodDeleteRequest deleteRequest;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "grant")})
    private com.braintreegateway.PaymentMethodGrantRequest grantRequest;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "create"), @ApiMethod(methodName = "update")})
    private com.braintreegateway.PaymentMethodRequest request;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete"), @ApiMethod(methodName = "find"), @ApiMethod(methodName = "grant"), @ApiMethod(methodName = "revoke"), @ApiMethod(methodName = "update")})
    private String token;

    public com.braintreegateway.PaymentMethodDeleteRequest getDeleteRequest() {
        return deleteRequest;
    }

    public void setDeleteRequest(com.braintreegateway.PaymentMethodDeleteRequest deleteRequest) {
        this.deleteRequest = deleteRequest;
    }

    public com.braintreegateway.PaymentMethodGrantRequest getGrantRequest() {
        return grantRequest;
    }

    public void setGrantRequest(com.braintreegateway.PaymentMethodGrantRequest grantRequest) {
        this.grantRequest = grantRequest;
    }

    public com.braintreegateway.PaymentMethodRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.PaymentMethodRequest request) {
        this.request = request;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
