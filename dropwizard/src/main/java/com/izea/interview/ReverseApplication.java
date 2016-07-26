package com.izea.interview;

import com.izea.interview.resources.ReverseResource;


import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class ReverseApplication extends Application<ReverseConfiguration> {
    public static void main(String[] args) throws Exception {
        new ReverseApplication().run(args);
    }

    @Override
    public String getName() {
        return "reverse";
    }

    @Override
    public void initialize(Bootstrap<ReverseConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(ReverseConfiguration config,
                    Environment environment) {
        final ReverseResource resource = new ReverseResource(
            config.getTemplate()
        );
        environment.jersey().register(resource);
    }
}
