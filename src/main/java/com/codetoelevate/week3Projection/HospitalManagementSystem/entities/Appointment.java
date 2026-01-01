package com.codetoelevate.week3Projection.HospitalManagementSystem.entities;

import jakarta.persistence.*;
import lombok.*;

import javax.print.Doc;
import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @Column(length = 500)
    private String reason;

    @ManyToOne //Owning side
    @JoinColumn(nullable = false)
    private Patient patient;

    @ManyToOne //owning side
    @JoinColumn(nullable = false)
    private Doctor doctor;
}
