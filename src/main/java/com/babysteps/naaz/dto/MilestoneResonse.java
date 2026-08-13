package com.babysteps.naaz.dto;

import com.babysteps.naaz.entity.MilestoneType;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

public record MilestoneResonse(
        UUID id,
        UUID babyId,
        MilestoneType type,
        String title,
        String notes,
        LocalDate achivedOn,
        Instant createdAt
) {
}
