package com.payments.domain.valueobject;

import lombok.Getter;

@Getter
public enum FrequencyType {

    DAILY("DAIL"),      // Daily payments
    WEEKLY("WEEK"),     // Weekly payments
    MONTHLY("MNTH"),    // Monthly payments
    ANNUAL("YEAR");     // Yearly payments

    private final String code;

    FrequencyType(String code) {
        this.code = code;
    }
}
