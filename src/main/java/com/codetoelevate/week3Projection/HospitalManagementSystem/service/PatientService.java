package com.codetoelevate.week3Projection.HospitalManagementSystem.service;

import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Patient;
import com.codetoelevate.week3Projection.HospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Transactional
    public void testPatientTransactions(){
        Patient p1 = patientRepository.findById(1L).orElseThrow();
        Patient p2 = patientRepository.findById(1L).orElseThrow();

        System.out.println(p1+" "+p2);
        System.out.println(p1==p2);
    }
}
