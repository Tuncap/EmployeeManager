package com.getarrays.employeemanager.repo;

import com.getarrays.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    //Spring understand this method and will create a query
    void deleteEmployeeById(Long id);

    //Spring understand this method and will create a query
    Optional<Employee> findEmployeeById(Long id);
}
