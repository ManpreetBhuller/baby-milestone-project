package com.babysteps.naaz.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "babies")
public class Baby {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID babyId;

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private LocalDate birthDate;

    public UUID getBabyId() {
        return babyId;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
