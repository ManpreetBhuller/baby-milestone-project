package com.babysteps.naaz.exception;

import java.util.UUID;

public class BabyNotFoundException extends RuntimeException {
    public BabyNotFoundException(UUID babyId) {
        super("Baby id " + babyId + " not found");
    }
}
