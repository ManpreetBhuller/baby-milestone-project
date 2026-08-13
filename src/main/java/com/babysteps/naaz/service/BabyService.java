package com.babysteps.naaz.service;

import com.babysteps.naaz.dto.BabyResponse;
import com.babysteps.naaz.dto.CreateBabyRequest;
import com.babysteps.naaz.entity.Baby;
import com.babysteps.naaz.exception.BabyNotFoundException;
import com.babysteps.naaz.repository.BabyRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BabyService {

    private BabyRepository babyRepository;

    public BabyService(BabyRepository babyRepository) {
        this.babyRepository = babyRepository;
    }

    @Transactional
    public BabyResponse createBaby(CreateBabyRequest request){
        Baby baby = new Baby();
        baby.setFirstName(request.firstName());
        baby.setLastName(request.lastName());
        baby.setBirthDate(request.dateOfBirth());

        Baby saved = babyRepository.save(baby);

        return toResponse(saved);
    }

    private BabyResponse toResponse(Baby baby){
        return new BabyResponse(
                baby.getBabyId(),
                baby.getFirstName(),
                baby.getLastName(),
                baby.getBirthDate(),
                baby.getCreatedAt()
        );
    }

    @Transactional(readOnly = true)
    public BabyResponse getBaby(UUID id){
        Baby baby = babyRepository.findById(id)
                .orElseThrow(() -> new BabyNotFoundException(id));

        return toResponse(baby);
    }
}
