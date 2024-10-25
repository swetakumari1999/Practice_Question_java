package com.spring.spring_ComponentDao;

import org.springframework.stereotype.Component;

@Component
public class ComponentJdbcConnection
{
    public ComponentJdbcConnection()
    {
        System.out.println("Jbdc Connection for ComponentScan jdbc ");
    }
}
