package com.joao.normando.Multi.Tenant.controller;

import com.joao.normando.Multi.Tenant.dao.EmployeeDAO;
import com.joao.normando.Multi.Tenant.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDAO;
    @RequestMapping(value = "employeeList")
    public java.util.List<Employee> emploeeList() {
        return (List<Employee>) employeeDAO.findAll();
    }
}
