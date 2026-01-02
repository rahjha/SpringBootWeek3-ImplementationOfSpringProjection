package com.codetoelevate.week3Projection.HospitalManagementSystem.service;

import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Insurance;
import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Patient;
import com.codetoelevate.week3Projection.HospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class InsuranceService {

    private final PatientRepository patientRepository;

    public InsuranceService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Transactional
    public Insurance assignInsuranceToPatient(Insurance insurance, Long patientId){

        Patient patient = patientRepository.findById(patientId).orElseThrow();
        patient.setInsurance(insurance); //dirtied the patient

        insurance.setPatient(patient);//optional and just to maintain bidirectional
        return insurance;
    }
}