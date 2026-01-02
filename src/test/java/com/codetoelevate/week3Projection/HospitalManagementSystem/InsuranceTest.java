package com.codetoelevate.week3Projection.HospitalManagementSystem;

import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Appointment;
import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Insurance;
import com.codetoelevate.week3Projection.HospitalManagementSystem.service.AppointmentService;
import com.codetoelevate.week3Projection.HospitalManagementSystem.service.InsuranceService;
import com.codetoelevate.week3Projection.HospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTest {

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void testAssignInsuranceToPatient(){

        Insurance insurance = Insurance.builder()
                .provider("HDFC ERGO")
                .policyNumber("POL-IND-1001")
                .validTill(LocalDate.of(2026,12,31))
                .build();

        var patient = insuranceService.assignInsuranceToPatient(insurance, 10L);
        System.out.println(patient);
        patientService.deletePatient(10L);
    }

    @Test
    public void testCreateNewAppointment(){
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2026,01,05, 13,00,00))
                .reason("Appointment for Orthopedics")
                .build();
        var newAppointment = appointmentService.createNewAppointment(appointment, 2L, 3L);
        System.out.println(newAppointment);
    }
}
