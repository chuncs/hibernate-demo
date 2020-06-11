package com.synergistic.hibernatedemo.service;

import com.synergistic.hibernatedemo.model.CompanyDTO;
import com.synergistic.hibernatedemo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public void createCompany(String name, String address) {
        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setCompanyName(name);
        companyDTO.setCompanyAddress(address);
        companyRepository.save(companyDTO);
    }
}
