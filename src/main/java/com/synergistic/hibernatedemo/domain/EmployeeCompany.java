package com.synergistic.hibernatedemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeCompany {

    private String employeeName;
    private String employeeAddress;
    private String companyName;
    private String companyAddress;
}
