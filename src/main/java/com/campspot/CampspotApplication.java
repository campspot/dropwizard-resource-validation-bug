package com.campspot;

import com.campspot.resources.ValidatedResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CampspotApplication extends Application<CampspotConfiguration> {

    public static void main(final String[] args) throws Exception {
        new CampspotApplication().run(args);
    }

    @Override
    public String getName() {
        return "Campspot";
    }

    @Override
    public void initialize(final Bootstrap<CampspotConfiguration> bootstrap) {
    }

    @Override
    public void run(final CampspotConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new ValidatedResource());
    }
}
