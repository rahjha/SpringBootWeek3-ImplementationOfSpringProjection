package com.codetoelevate.week3Projection.HospitalManagementSystem.repository;

import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
