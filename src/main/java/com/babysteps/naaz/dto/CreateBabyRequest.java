package com.babysteps.naaz.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record CreateBabyRequest(

    @Size(max = 100)
    String firstName,

    @NotBlank(message = "Lastname is required")
    @Size(max = 100)
    String lastName,

    @NotNull(message = "Date of birth is requred")
    @PastOrPresent(message = "Date of birth can not be in the future")
    LocalDate dateOfBirth
){}
