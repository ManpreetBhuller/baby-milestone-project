package com.babysteps.naaz.repository;

import com.babysteps.naaz.entity.Baby;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BabyRepository extends JpaRepository<Baby, UUID> {
}
