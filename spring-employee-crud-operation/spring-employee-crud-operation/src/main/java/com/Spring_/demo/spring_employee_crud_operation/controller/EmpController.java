package com.Spring_.demo.spring_employee_crud_operation.controller;

import com.Spring_.demo.spring_employee_crud_operation.dto.request.EmployeeRequestDto;
import com.Spring_.demo.spring_employee_crud_operation.dto.response.EmployeeResponseDto;
import com.Spring_.demo.spring_employee_crud_operation.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/employees") // Base path for employee-related endpoints
@Slf4j
public class EmpController {

    private static final Logger logger = LoggerFactory.getLogger(EmpController.class);

    @Autowired
    private EmployeeService employeeService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeResponseDto createEmployee(@RequestBody EmployeeRequestDto requestDto)
    {
        logger.info("Post Mappping is working");
        return employeeService.createEmployee(requestDto);
    }
    @GetMapping
    public List<EmployeeResponseDto> getAllEmployees() {
          logger.info("Get Mapping is working");
         return employeeService.getAllEmployees();
    }


    @GetMapping("/{id}")
    public EmployeeResponseDto getEmployeeById(@PathVariable int id) {
        logger.info("Get Id is working");
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{empId}")
    public EmployeeResponseDto updateEmployee(@PathVariable int empId, @RequestBody EmployeeRequestDto requestDto) {
        logger.info("Put Mapping is working");
        return employeeService.updateEmployee(empId, requestDto);

    }
    @PatchMapping("/patch/{empId}")
    //@RequestMapping(value = "/employees/{id}", method = RequestMethod.PATCH)
    public EmployeeResponseDto patchEmployee(@PathVariable int empId, @RequestBody EmployeeRequestDto requestDto)
    {
        logger.info("Patch is working");
        return employeeService.patchEmployee(empId, requestDto);
    }

    @DeleteMapping("/{empId}")
    public void deleteEmployee(@PathVariable int empId)
    {   log.info("Delete Mapping ");
        employeeService.deleteEmployee(empId);
    }
}
