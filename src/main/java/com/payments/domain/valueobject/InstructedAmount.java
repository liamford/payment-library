package com.payments.domain.valueobject;


import lombok.Getter;

import java.util.regex.Pattern;


@Getter
public class InstructedAmount {
    private final Currency currency;
    private final String amount; // Amount in the specified currency

    public InstructedAmount(Currency currency, String amount) {
        if (currency == null) {
            throw new IllegalArgumentException("Currency cannot be null");
        }

        if (amount == null || !Pattern.matches("^\\d+\\.\\d{2}$", amount)) {
            throw new IllegalArgumentException("Amount must follow the ISO 4217 format with two decimal places.");
        }

        this.currency = currency;
        this.amount = amount;
    }
}
