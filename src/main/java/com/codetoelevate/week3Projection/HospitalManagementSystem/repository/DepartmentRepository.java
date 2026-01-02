package com.codetoelevate.week3Projection.HospitalManagementSystem.repository;

import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
