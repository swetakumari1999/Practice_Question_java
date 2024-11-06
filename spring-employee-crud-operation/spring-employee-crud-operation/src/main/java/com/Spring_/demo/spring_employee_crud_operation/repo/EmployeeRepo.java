package com.Spring_.demo.spring_employee_crud_operation.repo;

import com.Spring_.demo.spring_employee_crud_operation.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer > {

}
