package com.synergistic.hibernatedemo.service;

import com.synergistic.hibernatedemo.model.CompanyDTO;
import com.synergistic.hibernatedemo.model.EmployeeDTO;
import com.synergistic.hibernatedemo.repository.CompanyRepository;
import com.synergistic.hibernatedemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private CompanyRepository companyRepository;

    public void createEmployee(String name, String address, long companyId) {
        CompanyDTO company = companyRepository.findById(companyId);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeName(name);
        employeeDTO.setEmployeeAddress(address);
        employeeDTO.setCompany(company);
        employeeRepository.save(employeeDTO);
    }

    public List<EmployeeDTO> getAllEmployee() {
        System.out.println(employeeRepository.findAllEmployeeCompany());

        return employeeRepository.findAllEmployee();
    }
}
