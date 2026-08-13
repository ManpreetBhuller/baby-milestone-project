package com.babysteps.naaz.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "babies")
public class Baby {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID babyId;

    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate birthDate;

    public UUID getBabyId() {
        return babyId;
    }

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Instant createdAt;

    public void setBabyId(UUID babyId) {
        this.babyId = babyId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
