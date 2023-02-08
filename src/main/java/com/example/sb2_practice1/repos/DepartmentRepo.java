package com.example.sb2_practice1.repos;

import com.example.sb2_practice1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("departmentRepository")
public interface DepartmentRepo extends JpaRepository<Department, Long> {

    List<Department> findBy();
}