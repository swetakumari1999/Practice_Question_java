package com.Spring_jpaMysql.spring_jpa_demo_Mysql.rep;

import com.Spring_jpaMysql.spring_jpa_demo_Mysql.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PersonRepo
{
    @PersistenceContext
    EntityManager entityManager ;
    public Person findById(int id) {

        return entityManager.find(Person.class, id);
    }

    public Person update(Person person)
    {
        return entityManager.merge(person);
    }

    public Person insert(Person person)
    {
        return entityManager.merge(person);
    }

    public void  deletedById(int id)
    {
        Person person = findById(id);
        entityManager.remove(person);
    }
}
