package com.babysteps.naaz.dto;

import com.babysteps.naaz.entity.MilestoneType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.UUID;

public record CreateMilestoneRequest(
        @NotNull(message = "Baby Id is required")
        UUID babyId,

        MilestoneType type,

        @NotNull(message = "Title can not be null")
        @Size(max = 200)
        String title,

        String notes,

        @NotNull(message = "Achieved date is requred")
        @PastOrPresent(message = "Achieved date can not be in future")
        LocalDate achievedOn
) {
}
