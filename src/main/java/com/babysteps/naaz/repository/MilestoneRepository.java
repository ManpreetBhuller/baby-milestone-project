package com.babysteps.naaz.repository;

import com.babysteps.naaz.entity.Milestone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MilestoneRepository extends JpaRepository<Milestone, UUID> {
    Page<Milestone> findByBabyBabyId(UUID babyId, Pageable pageable);
}
