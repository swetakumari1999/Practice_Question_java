package com.Spring_.demo.spring_employee_crud_operation.service;
import com.Spring_.demo.spring_employee_crud_operation.dto.request.EmployeeRequestDto;
import com.Spring_.demo.spring_employee_crud_operation.dto.response.EmployeeResponseDto;
import com.Spring_.demo.spring_employee_crud_operation.entities.Employee;
import com.Spring_.demo.spring_employee_crud_operation.exception.ResourceNotFoundException;
import com.Spring_.demo.spring_employee_crud_operation.repo.EmployeeRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.ReadOnlyFileSystemException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public EmployeeResponseDto createEmployee(EmployeeRequestDto requestDto) {

        LocalDate dob = LocalDate.parse(requestDto.getDob(), DateTimeFormatter.ISO_DATE);


        Employee employee = new Employee();
        employee.setFirstName(requestDto.getFirstName());
        employee.setLastName(requestDto.getLastName());
        employee.setPhone(requestDto.getPhoneNumber());
        employee.setEmail(requestDto.getEmailId());
        employee.setDob(String.valueOf(dob));  // Set the parsed date of birth
        employee.setCurrent_address(requestDto.getCurrentAddress());
        employee.setPermanent_address(requestDto.getPermanentAddress());


        Employee savedEmployee = employeeRepo.save(employee);


        EmployeeResponseDto responseDto = modelMapper.map(savedEmployee, EmployeeResponseDto.class);
        responseDto.setFullName(savedEmployee.getFullName());
        responseDto.setAge(savedEmployee.calculateAge());
        responseDto.setEmail(savedEmployee.getEmail());
        responseDto.setCurrentAddress(savedEmployee.getCurrent_address());
        responseDto.setPermanentAddress(savedEmployee.getPermanent_address());

        return responseDto;
    }

    @Override
    public List<EmployeeResponseDto> getAllEmployees() {

        Iterable<Employee> all = employeeRepo.findAll();

        List<EmployeeResponseDto> responseDtoList = new ArrayList<>();

        for (Employee employee : all) {
            EmployeeResponseDto responseDto = modelMapper.map(employee, EmployeeResponseDto.class);
            responseDto.setId(employee.getId());
            responseDto.setFullName(employee.getFullName());
            responseDto.setEmail(employee.getEmail());
            responseDto.setAge(employee.calculateAge());
            responseDto.setCurrentAddress(employee.getCurrent_address());
            responseDto.setPermanentAddress(employee.getPermanent_address());

            responseDtoList.add(responseDto);
        }

        return responseDtoList;
    }



    @Override
  public EmployeeResponseDto getEmployeeById(int id) {
        Employee employee = employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found Excention"));
        EmployeeResponseDto responseDto = modelMapper.map(employee, EmployeeResponseDto.class);
        responseDto.setFullName(employee.getFullName());
        responseDto.setAge(employee.calculateAge());
        responseDto.setEmail(employee.getEmail());
        responseDto.setCurrentAddress(employee.getCurrent_address());
        responseDto.setPermanentAddress(employee.getPermanent_address());
        return responseDto;
    }
@Override
    public EmployeeResponseDto updateEmployee(int id, EmployeeRequestDto requestDto) {
        Employee employee = employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee id not found"));
        employee.setFirstName(requestDto.getFirstName());
        employee.setLastName(requestDto.getLastName());
        employee.setPhone(requestDto.getPhoneNumber());
        employee.setEmail(requestDto.getEmailId());
        employee.setDob(requestDto.getDob());
        employee.setCurrent_address(requestDto.getCurrentAddress());
        employee.setPermanent_address(requestDto.getPermanentAddress());

        Employee updatedEmployee = employeeRepo.save(employee);

        EmployeeResponseDto responseDto = modelMapper.map(updatedEmployee, EmployeeResponseDto.class);

        responseDto.setFullName(updatedEmployee.getFullName());
        responseDto.setAge(updatedEmployee.calculateAge());
        responseDto.setEmail(updatedEmployee.getEmail());
        responseDto.setPhoneNumber(updatedEmployee.getPhone());
        responseDto.setCurrentAddress(updatedEmployee.getCurrent_address());
        responseDto.setPermanentAddress(updatedEmployee.getPermanent_address());

        return responseDto;
    }

    @Override
    public EmployeeResponseDto patchEmployee(int id, EmployeeRequestDto requestDto) {

        Employee employee = employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found"));


        if (requestDto.getFirstName() != null) {
            employee.setFirstName(requestDto.getFirstName());
        }
        if (requestDto.getLastName() != null) {
            employee.setLastName(requestDto.getLastName());
        }
        if (requestDto.getPhoneNumber() != null) {
            employee.setPhone(requestDto.getPhoneNumber());
        }
        if (requestDto.getEmailId() != null) {
            employee.setEmail(requestDto.getEmailId());
        }
        if (requestDto.getDob() != null) {
            employee.setDob(requestDto.getDob());
        }
        if (requestDto.getCurrentAddress() != null) {
            employee.setCurrent_address(requestDto.getCurrentAddress());
        }
        if (requestDto.getPermanentAddress() != null) {
            employee.setPermanent_address(requestDto.getPermanentAddress());
        }


        Employee patchedEmployee = employeeRepo.save(employee);


        EmployeeResponseDto responseDto = modelMapper.map(patchedEmployee, EmployeeResponseDto.class);


        responseDto.setFullName(patchedEmployee.getFullName());
        responseDto.setAge(patchedEmployee.calculateAge());
        responseDto.setEmail(patchedEmployee.getEmail());
        responseDto.setPhoneNumber(patchedEmployee.getPhone());
        responseDto.setCurrentAddress(patchedEmployee.getCurrent_address());
        responseDto.setPermanentAddress(patchedEmployee.getPermanent_address());
        responseDto.setId(patchedEmployee.getId());

        return responseDto;
    }



    public void deleteEmployee(int id) {
        Employee employee = employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee resource not found"));
        employeeRepo.delete(employee);
    }
}



