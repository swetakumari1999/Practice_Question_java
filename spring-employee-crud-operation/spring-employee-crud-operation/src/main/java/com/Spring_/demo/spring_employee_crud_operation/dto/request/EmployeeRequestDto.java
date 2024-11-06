package com.Spring_.demo.spring_employee_crud_operation.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

@Data
public class EmployeeRequestDto {

        @NonNull
        private String firstName;  // First name

        @NonNull
        private String lastName;   // Last name
        private String phoneNumber;
        private String emailId;
        private String dob;
        private String currentAddress;
        private String permanentAddress;
    }


