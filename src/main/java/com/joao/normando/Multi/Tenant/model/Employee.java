package com.joao.normando.Multi.Tenant.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeId")

    private Long employeeId;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "employeeRole")
    private String employeeRole;

}