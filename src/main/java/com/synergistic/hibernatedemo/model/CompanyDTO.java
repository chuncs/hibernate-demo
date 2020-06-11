package com.synergistic.hibernatedemo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "company")
public class CompanyDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String companyName;
    private String companyAddress;

}
