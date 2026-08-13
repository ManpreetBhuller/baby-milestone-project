package com.babysteps.naaz;

import com.babysteps.naaz.entity.Baby;
import com.babysteps.naaz.repository.BabyRepository;
import com.babysteps.naaz.repository.MilestoneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class NaazApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaazApplication.class, args);
	}

	@Bean
	CommandLineRunner testRun(BabyRepository babyRepository, MilestoneRepository milestoneRepository) {
		return args -> {
			Baby baby = new Baby();
			baby.setFirstName("Harnaaz");
			baby.setLastName("Bhuller");
			baby.setBirthDate(LocalDate.now());
			babyRepository.save(baby);
			System.out.println("Saved baby: " + baby.getBabyId());
		};
	}

}
