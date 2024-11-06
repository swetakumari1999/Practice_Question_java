//package com.Spring_.demo.spring_employee_crud_operation.test;
//
//import com.Spring_.demo.spring_employee_crud_operation.entities.Employee;
//import com.Spring_.demo.spring_employee_crud_operation.repo.EmployeeRepo;
//import jakarta.transaction.Transactional;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.annotation.Rollback;
//
//import java.util.List;
//import java.util.Optional;
//
//@DataJpaTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)  // Ensure tests are run in a specific order
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//public class EmployeeRepoTest {
//
//    @Autowired
//    private EmployeeRepo employeeRepo;
//
//    // Test saving an employee
//
//    @Test
//    @Order(1)
//    @Rollback(value = false) // Ensure the data is persisted to the database after test
//    public void saveEmployeeTest() {
//        // Create an employee using builder pattern
//        Employee employee = Employee.builder()
//                .name("Suuny Reddy")
//                .phone("9905337868")
//                .email("sunny5@gmail.com")
//                .build();
//
//        // Save the employee to the repository
//        employeeRepo.save(employee);
//
//        // Print the employee object to check
//        System.out.println(employee);
//
//        // Verify the employee's ID is greater than 0 (indicating it's been saved)
//        Assertions.assertThat(employee.getId()).isGreaterThan(0);
//    }
//
//    // Test retrieving an employee by ID
//    @Test
//    @Order(2)
//    @Transactional
//    public void getEmployeeTest() {
//        // Assuming employee with ID 3 exists in the database, fetch it
//        Employee emp = employeeRepo.findById(3).orElseThrow(() -> new RuntimeException("Employee not found"));
//
//        // Print the employee
//        System.out.println(emp);
//
//        // Verify the employee ID is 3
//        Assertions.assertThat(emp.getId()).isEqualTo(3);
//    }
//
//    // Test retrieving a list of all employees
//    @Test
//    @Order(3)
//    public void getListOfEmployeesTest() {
//        // Fetch all employees
//        List<Employee> employees = (List<Employee>) employeeRepo.findAll();
//
//        // Print the list of employees
//        System.out.println(employees);
//
//        // Verify there are more than 0 employees in the list
//        Assertions.assertThat(employees.size()).isGreaterThan(0);
//    }
//
//    // Test updating an employee
//    @Test
//    @Order(4)
//    @Rollback(value = false) // Persist the updated employee
//    public void updateEmployeeTest() {
//        // Fetch employee with ID 3
//        Employee employee = employeeRepo.findById(3).orElseThrow(() -> new RuntimeException("Employee not found"));
//
//        // Update the email
//        employee.setEmail("sunnyreddy5@gmail.com");
//
//        // Save the updated employee
//        employeeRepo.save(employee);
//
//        // Fetch the employee again to ensure changes were saved
//        Employee updatedEmployee = employeeRepo.findById(3).orElseThrow(() -> new RuntimeException("Employee not found"));
//
//        // Print and verify the updated email
//        System.out.println(updatedEmployee);
//        Assertions.assertThat(updatedEmployee.getEmail()).isEqualTo("sunnyreddy5@gmail.com");
//    }
//
//
//
//
//
//    // Test deleting an employee
//    @Test
//    @Order(5)
//    @Rollback(value = false) // Persist the deletion
//    public void deleteEmployeeTest() {
//        // Delete the employee with ID 3
//        employeeRepo.deleteById(3);
//
//        // Verify that the employee is deleted by trying to fetch it
//        Optional<Employee> employeeOptional = employeeRepo.findById(3);
//
//        // Assert that the employee is not found
//        Assertions.assertThat(employeeOptional).isEmpty();
//    }
//}
