package com.example;

import com.example.resources.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloDropWizardApplication extends Application<HelloDropWizardConfiguration>
{
    public static void main(final String[] args) throws Exception
    {
        new HelloDropWizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloDropWizard";
    }

    @Override
    public void initialize(final Bootstrap<HelloDropWizardConfiguration> bootstrap)
    {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloDropWizardConfiguration conf, final Environment env)
    {
        final HelloResource hello = new HelloResource(conf.getTemplate(), conf.getDefaultName());
        env.jersey().register(hello);
    }

}
