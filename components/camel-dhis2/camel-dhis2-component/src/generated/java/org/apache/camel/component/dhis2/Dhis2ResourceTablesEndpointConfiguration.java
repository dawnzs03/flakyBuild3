/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.dhis2;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.dhis2.api.Dhis2ResourceTables}.
 */
@ApiParams(apiName = "resourceTables", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "analytics", signatures={"void analytics(Boolean skipAggregate, Boolean skipEvents, Integer lastYears, Integer interval)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class Dhis2ResourceTablesEndpointConfiguration extends Dhis2Configuration {
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "analytics")})
    private Integer interval;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "analytics")})
    private Integer lastYears;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "analytics")})
    private Boolean skipAggregate;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "analytics")})
    private Boolean skipEvents;

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Integer getLastYears() {
        return lastYears;
    }

    public void setLastYears(Integer lastYears) {
        this.lastYears = lastYears;
    }

    public Boolean getSkipAggregate() {
        return skipAggregate;
    }

    public void setSkipAggregate(Boolean skipAggregate) {
        this.skipAggregate = skipAggregate;
    }

    public Boolean getSkipEvents() {
        return skipEvents;
    }

    public void setSkipEvents(Boolean skipEvents) {
        this.skipEvents = skipEvents;
    }
}
