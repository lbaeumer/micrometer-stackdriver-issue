package de.quaestio24.service;

import de.quaestio24.dto.Config;
import de.quaestio24.util.Micrometer;
import io.micrometer.core.instrument.Tags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ConfigService {

    private static final Logger log = LoggerFactory.getLogger(ConfigService.class.getName());

    public Config getConfig(String site) {
        log.info("getConfig(" + site + ")");

        Config c = new Config();
        c.site = site;

        // sleep some seconds in order to simulate some action
        // and to force GAE to start a new instance
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Tags tags = Tags.of("ns_" + site, site,
                "instance" + this.hashCode()
                        + "_" + System.currentTimeMillis()
                        + "_" + new Random().nextInt(), "hallo",
                "user", "me");

        log.info("tags(" + site + ") " + tags);

        Micrometer.Metrics().counter("config.hallo." + site, tags)
                .increment();

        return c;
    }
}
