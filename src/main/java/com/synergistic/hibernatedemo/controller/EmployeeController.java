package com.synergistic.hibernatedemo.controller;

import com.synergistic.hibernatedemo.model.EmployeeDTO;
import com.synergistic.hibernatedemo.service.CompanyService;
import com.synergistic.hibernatedemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<String> createEmployee(@RequestParam String name, @RequestParam String address, @RequestParam long companyId) {
        employeeService.createEmployee(name, address, companyId);
        return ResponseEntity.ok("Employee created!");
    }

    @PostMapping("/company")
    public ResponseEntity<String> createCompany(@RequestParam String name, @RequestParam String address) {
        companyService.createCompany(name, address);
        return ResponseEntity.ok("Company created!");
    }

    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<EmployeeDTO>> getAllEmployee() {
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }
}
