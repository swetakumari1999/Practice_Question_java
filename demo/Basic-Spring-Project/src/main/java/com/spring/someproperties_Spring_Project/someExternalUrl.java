package com.spring.someproperties_Spring_Project;

import org.springframework.beans.factory.annotation.Value;

public class someExternalUrl
{
    @Value("${external.service.url}")
    private String url;

    public String returnServiceUrl()
    {
        return url;
    }
}
