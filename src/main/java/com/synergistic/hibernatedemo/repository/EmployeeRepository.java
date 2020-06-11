package com.synergistic.hibernatedemo.repository;

import com.synergistic.hibernatedemo.model.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDTO, Long> {

    @Query("SELECT e FROM EmployeeDTO e LEFT JOIN FETCH e.companyDTO")
    public List<EmployeeDTO> findAllEmployee();
}
