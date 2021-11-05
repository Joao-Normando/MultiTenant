package com.joao.normando.Multi.Tenant.dao;

import com.joao.normando.Multi.Tenant.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository

public interface EmployeeDAO extends CrudRepository<Employee, Long> {
    List<Employee> findAll();
}
