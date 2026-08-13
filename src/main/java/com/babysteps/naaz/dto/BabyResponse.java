package com.babysteps.naaz.dto;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

public record BabyResponse(
        UUID id,
        String firstName,
        String lastName,
        LocalDate datOfBirth,
        Instant createdAt
) {
}
