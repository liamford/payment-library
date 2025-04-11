package com.payments.domain.valueobject;

import lombok.Getter;

@Getter
public enum Classification {
    FIXED("FIXE"),      // Fixed payment
    VARIABLE("VARI"),   // Variable payment
    OTHER("OTHR");

    private final String code;

    Classification(String code) {
        this.code = code;
    }
}
