package com.spring.spring_personDao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository

public class JdbcConnection
{
  public JdbcConnection()
  {
      System.out.println("jdbc connection");
  }
}
