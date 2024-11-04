package com.Spring_jdbc_to_jpa.spring_database_demo.dao;

import com.Spring_jdbc_to_jpa.spring_database_demo.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDao
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    public String findAll() {
    jdbcTemplate.query("select * from person",
            new BeanPropertyRowMapper<>(Person.class));
        return null;
    }

}
