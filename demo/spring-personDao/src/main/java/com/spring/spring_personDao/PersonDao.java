package com.spring.spring_personDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao
{
    @Autowired
   private JdbcConnection jdbcConnection;
    public void setJdbcConnection(JdbcConnection jdbcConnection)
    {
        this.jdbcConnection = jdbcConnection;
    }
   public JdbcConnection  getJdbcConnection()
   {
   return jdbcConnection;
   }

}
