package com.synergistic.hibernatedemo.repository;

import com.synergistic.hibernatedemo.model.CompanyDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyDTO, Long> {

    CompanyDTO findById(long companyId);
}
