package com.example;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;

public class HelloDropWizardConfiguration extends Configuration {
    @NotEmpty
    private String defaultName;

    @NotEmpty
    private String template;

    @JsonProperty
    public String getDefaultName()
    {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String defaultName)
    {
        this.defaultName = defaultName;
    }


    @JsonProperty
    public String getTemplate()
    {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template)
    {
        this.template = template;
    }
}
