package com.example.demo.repository;

import org.springframework.data.jpa.repository.jparepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends
jpaRepository<Employee, Integer>{

}
