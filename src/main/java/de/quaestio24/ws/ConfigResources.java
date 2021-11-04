package de.quaestio24.ws;

import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Tags;
import io.micrometer.stackdriver.StackdriverConfig;
import io.micrometer.stackdriver.StackdriverMeterRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.time.Duration;
import java.util.Random;

@Path("/ws/config")
public class ConfigResources {
    private static final Logger log = LoggerFactory.getLogger(ConfigResources.class.getName());

    public static MeterRegistry metrics;

    @GET
    @Path("/{site}")
    @Produces("application/json; charset=UTF-8")
    public Response getConfig(@PathParam("site") String site) throws InterruptedException {

        log.debug("getConfig(" + site + ")");

        // sleep some seconds in order to simulate some action
        // and to force GAE to start a new instance
        Thread.sleep(2000);
        // adding tag with unique key and unique values for each request
        Tags tags = Tags.of("ns_" + site, site,
                "instance" + this.hashCode() + "_" + System.currentTimeMillis() + "_" + new Random().nextInt(),
                "value" + this.hashCode()+ "_" + System.currentTimeMillis() + "_" + new Random().nextInt(),
                "user", "me");

        log.info("tags(" + site + ") " + tags);
        // measurement is unique in this case; 4 requests with different site
        Metrics().counter("config.hallo2." + site, tags)
                .increment();

        return Response.ok(site).build();
    }

    private static MeterRegistry Metrics() {
        if (metrics == null) {
            StackdriverConfig config = new StackdriverConfig() {
                @Override
                public Duration step() {
                    return Duration.ofSeconds(60);
                }

                @Override
                public String projectId() {
                    return "test-quaestio24-service";
                }

                @Override
                public String get(String key) {
                    if ("stackdriver.resourceType".equals(key)) {
                        return "global";
                    }
                    return null;
                }
            };

            MeterRegistry registry = StackdriverMeterRegistry.builder(config)
                    .clock(Clock.SYSTEM)
                    .build();
            Metrics.addRegistry(registry);
            // for every GAE instance a unique instanceid value
            registry.config().commonTags("instanceid", registry.hashCode() + "_" + new Random().nextInt());

            metrics = Metrics.globalRegistry;
        }
        return metrics;
    }
}
