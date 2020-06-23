package com.synergistic.hibernatedemo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employee")
public class EmployeeDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private CompanyDTO company;
    private String employeeName;
    private String employeeAddress;

}
