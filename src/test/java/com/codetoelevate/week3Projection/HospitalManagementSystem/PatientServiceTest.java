package com.codetoelevate.week3Projection.HospitalManagementSystem;

import com.codetoelevate.week3Projection.HospitalManagementSystem.dto.BloodGroupStats;
import com.codetoelevate.week3Projection.HospitalManagementSystem.dto.CPatientInfo;
import com.codetoelevate.week3Projection.HospitalManagementSystem.dto.IPatientInfo;
import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Patient;
import com.codetoelevate.week3Projection.HospitalManagementSystem.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatient(){
        List<Patient> patients = patientRepository.findAll();

        for(Patient patient : patients){
            System.out.println(patient);
        }
    }

    @Test
    public void testPatientProjectionUsingInterface(){
        List<IPatientInfo> patients = patientRepository.getAllPatientInfo();

        for(IPatientInfo patient : patients){
            System.out.println(
                    "Id: " + patient.getId() +
                    ", Name: " + patient.getName() +
                    ", Email: " + patient.getEmail()
            );
        }
    }

    @Test
    public void testPatientProjectionUsingConcreteClass(){
        List<CPatientInfo> patients = patientRepository.getAllPatientInfoConcreate();

        for(CPatientInfo patient : patients){
            System.out.println(patient);
        }
    }

    @Test
    public void testPatientGetBloodGroupStats(){
        List<BloodGroupStats> bloodGroupStats = patientRepository.getBloodGroupStats();
        for(BloodGroupStats stats : bloodGroupStats){
            System.out.println(stats);
        }
    }

    @Test
    public void testPatientUpdatePatientNameWithId(){
        int count = patientRepository.updatePatientNameById("Priya Sharma", Long.valueOf(1));
        System.out.println("Number of rows updated :"+count);
    }

}
