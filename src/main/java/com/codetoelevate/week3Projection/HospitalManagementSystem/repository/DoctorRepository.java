package com.codetoelevate.week3Projection.HospitalManagementSystem.repository;

import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
