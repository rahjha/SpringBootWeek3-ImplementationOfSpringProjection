package com.codetoelevate.week3Projection.HospitalManagementSystem.service;

import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Appointment;
import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Doctor;
import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Patient;
import com.codetoelevate.week3Projection.HospitalManagementSystem.repository.AppointmentRepository;
import com.codetoelevate.week3Projection.HospitalManagementSystem.repository.DoctorRepository;
import com.codetoelevate.week3Projection.HospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class AppointmentService {

    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final AppointmentRepository appointmentRepository;

    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long patientId, Long doctorId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setDoctor(doctor);
        appointment.setPatient(patient);
        appointmentRepository.save(appointment);

        return appointment;
    }
}
