package com.spring.spring_ComponentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@Component
public class ComponentScanConnection
{
    @Autowired
    private ComponentJdbcConnection componentJdbcConnection;

    public void setComponentJdbcConnection(ComponentJdbcConnection componentJdbcConnection)
    {
        this.componentJdbcConnection = componentJdbcConnection;
    }
    public  ComponentJdbcConnection getComponentJdbcConnection()
    {
        return componentJdbcConnection;
    }
}
