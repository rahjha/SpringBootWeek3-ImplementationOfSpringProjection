package com.codetoelevate.week3Projection.HospitalManagementSystem.repository;

import com.codetoelevate.week3Projection.HospitalManagementSystem.dto.BloodGroupStats;
import com.codetoelevate.week3Projection.HospitalManagementSystem.dto.CPatientInfo;
import com.codetoelevate.week3Projection.HospitalManagementSystem.dto.IPatientInfo;
import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query("select p.id as id, p.name as name, p.email as email from Patient p")
    List<IPatientInfo> getAllPatientInfo();

    @Query("select new com.codetoelevate.week3Projection.HospitalManagementSystem.dto.CPatientInfo(p.id, p.name) " +
            " from Patient p")
    List<CPatientInfo> getAllPatientInfoConcreate();

    @Query("select new com.codetoelevate.week3Projection.HospitalManagementSystem.dto.BloodGroupStats(p.bloodGroup, COUNT(p))" +
            " from Patient p group by p.bloodGroup order by COUNT(p) desc")
    List<BloodGroupStats> getBloodGroupStats();

    @Transactional
    @Modifying
    @Query("UPDATE Patient p set p.name=:name where p.id=:id")
    int updatePatientNameById(@Param("name") String name,
                              @Param("id") Long id);
}