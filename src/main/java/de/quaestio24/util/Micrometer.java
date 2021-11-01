package de.quaestio24.util;

import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.stackdriver.StackdriverConfig;
import io.micrometer.stackdriver.StackdriverMeterRegistry;

import java.time.Duration;

public class Micrometer {

    public static MeterRegistry metrics;

    public static MeterRegistry Metrics() {
        if (metrics == null) {
            metrics = init();
        }
        return metrics;
    }

    public static MeterRegistry init() {
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

        return Metrics.globalRegistry;
    }
}
