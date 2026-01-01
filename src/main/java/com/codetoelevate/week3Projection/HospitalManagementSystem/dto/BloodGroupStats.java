package com.codetoelevate.week3Projection.HospitalManagementSystem.dto;

import com.codetoelevate.week3Projection.HospitalManagementSystem.entities.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroup;
    private final Long count;
}
