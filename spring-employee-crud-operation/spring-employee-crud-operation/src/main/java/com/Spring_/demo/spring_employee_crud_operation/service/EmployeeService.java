package com.Spring_.demo.spring_employee_crud_operation.service;

import com.Spring_.demo.spring_employee_crud_operation.dto.request.EmployeeRequestDto;
import com.Spring_.demo.spring_employee_crud_operation.dto.response.EmployeeResponseDto;
import com.Spring_.demo.spring_employee_crud_operation.entities.Employee;

import java.util.List;

public interface EmployeeService
{
        EmployeeResponseDto createEmployee(EmployeeRequestDto requestDto);

        List<EmployeeResponseDto> getAllEmployees();

        EmployeeResponseDto getEmployeeById(int id);

        EmployeeResponseDto patchEmployee(int id, EmployeeRequestDto requestDto);

        EmployeeResponseDto updateEmployee(int id, EmployeeRequestDto requestDto);

        void deleteEmployee(int id);


}