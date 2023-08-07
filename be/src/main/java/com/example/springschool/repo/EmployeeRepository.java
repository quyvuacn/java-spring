package com.example.springschool.repo;

import com.example.springschool.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>, JpaSpecificationExecutor {
    @Query("SELECT e FROM employees e WHERE e.name = :name")
    List<Employee> findEmployeeByName(@Param("name") String name);
}
