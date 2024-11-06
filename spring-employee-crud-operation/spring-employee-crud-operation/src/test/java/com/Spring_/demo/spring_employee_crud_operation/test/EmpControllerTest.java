//package com.Spring_.demo.spring_employee_crud_operation.test;
//
//import com.Spring_.demo.spring_employee_crud_operation.controller.EmpController;
//import com.Spring_.demo.spring_employee_crud_operation.entities.Employee;
//import com.Spring_.demo.spring_employee_crud_operation.repo.EmployeeRepo;
//import com.Spring_.demo.spring_employee_crud_operation.service.EmployeeService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.ResultMatcher;
//
//import java.util.Optional;
//
//import static net.bytebuddy.matcher.ElementMatchers.is;
//import static org.mockito.BDDMockito.willDoNothing;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//
//@WebMvcTest(EmpController.class)  // WebMvcTest loads only the web layer (controller layer)
//@AutoConfigureMockMvc
//
//public class EmpControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private EmployeeService employeeService;  // This mocks the service layer
//
//    @Mock
//    private EmployeeRepo employeeRepo;  // This mocks the repository layer (but it's unused here since we mock the service directly)
//
//    @BeforeEach
//    public void setUp() {
//        // Any setup logic before each test (if necessary)
//    }
//
//    // Test case for adding an employee
//    @Test
//    public void testAddEmployee() throws Exception {
//        String json = "{\"name\":\"Ram kumar\",\"phone\":\"8976786789\",\"email\":\"ram95@gmail.com\"}";
//
//        mockMvc.perform(post("/employees")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(json))
//                .andExpect(status().isCreated());
//    }
//
//    // Test case for successfully fetching an employee (GET /employees/{empId})
//    @Test
//    public void testGetEmployee_Success() throws Exception {
//        // Prepare mock data
//        Employee mockEmployee = new Employee(1, "Ram kumar", "8976786789", "ram95@gmail.com");
//
//        // Mock the service method to return the mock data when called with empId = 1
//        when(employeeService.getEmployee(1)).thenReturn(mockEmployee);
//
//        // Perform the GET request for employee with empId = 1
//        mockMvc.perform(get("/employees/1"))
//                .andExpect(status().isOk())  // Expecting status 200 OK
//                .andExpect(jsonPath("$.name").value("Ram kumar"))
//                .andExpect(jsonPath("$.phone").value("8976786789"))
//                .andExpect(jsonPath("$.email").value("ram95@gmail.com"));
//    }
//
//    // Test case for employee not found (GET /employees/{empId})
//    @Test
//    public void testGetEmployee_NotFound() throws Exception {
//        // Mock the service to return null or throw exception for a non-existing employee
//        when(employeeService.getEmployee(99)).thenReturn(null);
//
//        // Perform the GET request for a non-existing employee with empId = 99
//        mockMvc.perform(get("/employees/99"))
//                .andExpect(status().isNotFound());  // Expecting status 404 Not Found
//    }
//
//    // Test case for deleting an employee
//    @Test
//    public void testDeleteEmployee() throws Exception {
//        mockMvc.perform(delete("/employees/1")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isNoContent());  // Expecting status 204 No Content
//    }
//
//    @Test
//    public void testDeleteEmployee_NotFound() throws Exception {
//        when(employeeRepo.findById(9)).thenReturn(Optional.empty());
//
//        mockMvc.perform(delete("/employees/9")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isNotFound());
//    }
//
//    @Test
//    public void testUpdateEmployee() throws Exception {
//        // Create a mock Employee that you expect to return after the update
//        Employee mockEmployee = new Employee(3, "Suuny Reddy", "9905337868", "sunny5@gmail.com");
//
//        when(employeeService.updateEmployee(mockEmployee)).thenReturn(mockEmployee);
//        String employeeJson = "{\"name\":\"Suuny Reddy\",\"phone\":\"9905337868\",\"email\":\"sunny5@gmail.com\"}";
//
//        // Perform the PUT request to update employee with ID 1
//        mockMvc.perform(put("/employees/3")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(employeeJson))
//                .andExpect(status().isOk())  // Expecting status 200 OK
//                .andExpect(jsonPath("$.name").value("Suuny Reddy"))
//                .andExpect(jsonPath("$.phone").value("9905337868"))
//                .andExpect(jsonPath("$.email").value("sunny5@gmail.com"));// Assert that the email is updated
//    }
//
//    @Test
//    public void testUpdateEmployee_NotFound() throws Exception {
//// this id is not available
//        Employee mockEmployee = new Employee(89, " ", " ", " ");
//
//        when(employeeService.updateEmployee(mockEmployee)).thenReturn(null);
//
//        // Define the JSON for the non-existent employee
//        String employeeJson = "{\"name\":\"Ram Kumar\",\"phone\":\"8976786789\",\"email\":\"ram95@gmail.com\"}";
//
//        mockMvc.perform(put("/employees/89")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(employeeJson))
//                .andExpect(status().isNotFound());
//    }
//
//}
//
//
//
//
//
