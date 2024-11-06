//package com.Spring_.demo.spring_employee_crud_operation.test;
//
//import com.Spring_.demo.spring_employee_crud_operation.entities.Employee;
//import com.Spring_.demo.spring_employee_crud_operation.repo.EmployeeRepo;
//import com.Spring_.demo.spring_employee_crud_operation.service.EmployeeServiceImpl;
//import jakarta.persistence.EntityNotFoundException;
//import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.BDDMockito.given;
//import static org.mockito.BDDMockito.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//
//@ExtendWith(MockitoExtension.class)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class EmployeeServiceTest
//{
//    @InjectMocks
//    private EmployeeServiceImpl employeeService;
//
//    @Mock
//    private EmployeeRepo employeeRepo;
//
//    private Employee employee;
//
//    @BeforeEach
//    public void setup(){
//
//        employee = Employee.builder()
//                .id(3)
//                .name("Suuny Reddy")
//                .phone("9905337868")
//                .email("sunny5@gmail.com")
//                .build();
//
//    }
//
//    @Test
//    @Order(1)
//    public void saveEmployeeTest()
//    {
//       /* given(employeeRepo.save(employee)).willReturn(employee);
//
//        Employee savedEmployee = employeeService.addEmployee(employee);
//
//        System.out.println(savedEmployee);
//        assertThat(savedEmployee).isNotNull();*/
//    }
//
//    @Test
//    @Order(2)
//    public void getEmployeeById()
//    {
//        given(employeeRepo.findById(3)).willReturn(Optional.of(employee));
//
//       // Employee savedEmployee = employeeService.getEmployee(employee.getId()).get();
//        Employee savedEmployee = employeeService.getEmployee(3);
//        System.out.println(savedEmployee);
//        assertThat(savedEmployee).isNotNull();
//    }
//
//    @Test
//    @Order(3)
//    public void getAllEmployee(){
//        Employee employee1 = Employee.builder()
//                .id(3)
//                .name("Suuny Reddy")
//                .phone("9905337868")
//                .email("sunny5@gmail.com")
//                .build();
//        Employee employee2 = Employee.builder()
//                .id(1)
//                .name("Ram kumar")
//                .phone("8976786789")
//                .email("ram95@gmail.com")
//                        .build();
//
//        // precondition
//        given(employeeRepo.findAll()).willReturn(List.of(employee,employee1,employee2));
//
//        // action
//        List<Employee> employeeList = employeeService.getEmployees();
//
//        // verify
//        System.out.println(employeeList);
//        assertThat(employeeList).isNotNull();
//        assertThat(employeeList.size()).isGreaterThan(1);
//    }
//
//
//    @Test
//    @Order(4)
//    void deleteEmployeeById() {
//        // precondition: create a mock Employee object with ID 3
//        Employee employee = new Employee(3, "Sunny Reddy", "9905337868", "sunny5@gmail.com");
//
//        // Mock: return the employee when findById is called with ID 3
//        given(employeeRepo.findById(employee.getId())).willReturn(Optional.of(employee));
//
//        // Mock: ensure deleteById is called when employeeService.deleteEmployee() is invoked
//        willDoNothing().given(employeeRepo).deleteById(employee.getId());
//
//        // action: invoke the service method to delete the employee by ID
//        employeeService.deleteEmployee(employee.getId());
//
//        // verify: ensure that deleteById was called once with the correct employee ID
//        verify(employeeRepo, times(1)).deleteById(employee.getId());
//    }
//
//
//
//
//
//    @Test
//    @Order(5)
//    public void testUpdateEmployee() {
//        // Precondition: employee with ID 3 exists in the repository
//        Employee employee = new Employee(3, "Suuny Reddy", "9905337868", "sunny5@gmail.com");
//
//        // Mock the repository behavior for findById (simulate the employee exists)
//        given(employeeRepo.findById(employee.getId())).willReturn(Optional.of(employee));
//
//        // Change the employee details for the update operation
//        employee.setName("Reddy");
//        employee.setPhone("1010101023");
//        employee.setEmail("Reddy5@gmail.com");
//
//        // Mock the save method to return the updated employee (simulate saving it)
//        given(employeeRepo.save(employee)).willReturn(employee);
//
//        // Action: call the updateEmployee method (this will call save internally)
//        Employee updatedEmployee = employeeService.updateEmployee(employee);
//
//        System.out.println(updatedEmployee);
//
//        // Verify the updated details
//        assertThat(updatedEmployee.getName()).isEqualTo("Reddy");
//        assertThat(updatedEmployee.getPhone()).isEqualTo("1010101023");
//        assertThat(updatedEmployee.getEmail()).isEqualTo("Reddy5@gmail.com");
//
//        // Optionally verify that save was called on the repository
//        verify(employeeRepo, times(1)).save(employee);  // Verify save was called once
//    }
//
//
//
//
//}
