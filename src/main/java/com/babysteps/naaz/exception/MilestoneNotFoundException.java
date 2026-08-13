package com.babysteps.naaz.exception;

import java.util.UUID;

public class MilestoneNotFoundException extends RuntimeException{
    public MilestoneNotFoundException(UUID id) {
        super("Miletone not found with id " + id);
    }
}
