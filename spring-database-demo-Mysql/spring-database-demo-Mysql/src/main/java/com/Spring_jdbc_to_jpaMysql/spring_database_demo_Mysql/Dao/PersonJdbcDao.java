package com.Spring_jdbc_to_jpaMysql.spring_database_demo_Mysql.Dao;

import com.Spring_jdbc_to_jpaMysql.spring_database_demo_Mysql.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;



@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    // Custom RowMapper
    class PersonRowMapper implements RowMapper<Person> {
        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setBirthDate(rs.getTimestamp("birth_date"));
            return person;
        }
    }

    public List<Person> findAll() {
        return jdbcTemplate.query("SELECT * FROM person", new PersonRowMapper());
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM person where id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Person.class));
    }


    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM person WHERE id=?", id);
    }

    public int insert(Person person) {
        return jdbcTemplate.update(
                "INSERT INTO person (id, name, location, birth_date) VALUES (?, ?, ?, ?)",
                person.getId(),
                person.getName(),
                person.getLocation(),
                new Timestamp(person.getBirthDate().getTime())
        );
    }



    }


//          public int update(Person person) {
//                  return jdbcTemplate.update(
//            "UPDATE person SET name = ?, location = ? WHERE id = ?",
//            person.getName(),
//            person.getLocation(),
//            person.getId()
//    );
//}

