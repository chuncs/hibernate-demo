package com.synergistic.hibernatedemo.repository;

import com.synergistic.hibernatedemo.domain.EmployeeCompany;
import com.synergistic.hibernatedemo.model.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDTO, Long> {

    @Query("SELECT e FROM EmployeeDTO e LEFT JOIN FETCH e.company")
    List<EmployeeDTO> findAllEmployee();

    //https://stackoverflow.com/questions/36328063/how-to-return-a-custom-object-from-a-spring-data-jpa-group-by-query
    @Query("select new com.synergistic.hibernatedemo.domain.EmployeeCompany(e.employeeName, e.employeeAddress, c.companyName, c.companyAddress) " +
            "from EmployeeDTO e, CompanyDTO c " +
            "where e.id = c.id")
    List<EmployeeCompany> findAllEmployeeCompany();
}
