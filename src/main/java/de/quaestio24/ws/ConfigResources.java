package de.quaestio24.ws;

import de.quaestio24.dto.Config;
import de.quaestio24.service.ConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;

@Path("/ws/config")
public class ConfigResources {
    private static final Logger log = LoggerFactory.getLogger(ConfigResources.class.getName());
    private final ConfigService configService = new ConfigService();

    @Context
    UriInfo uriInfo;

    @GET
    @Path("/{site}")
    @Produces("application/json; charset=UTF-8")
    @PermitAll
    public Response getConfig(@PathParam("site") String site) {

        log.debug("getConfig(" + site + ")");
        Config pref = configService.getConfig(site);

        ResponseBuilder builder;
        builder = Response.ok(pref);

        return builder.build();
    }
}
