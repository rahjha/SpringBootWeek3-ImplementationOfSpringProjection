package com.codetoelevate.week3Projection.HospitalManagementSystem.entities;

import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthDate;

    private String email;

    private String gender;

    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
