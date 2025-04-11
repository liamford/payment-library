package com.payments.domain.valueobject;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Authorisation {
    private final LocalDateTime expiryDateTime;
    private final LocalDateTime lastUpdateDateTime;
    private final int numberReceived;
    private final int numberRequired;
    private final AuthorisationStatus status; // Added status field
}
