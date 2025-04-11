package com.payments.domain.valueobject.bpay;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BpayInstructionType {

    PAYMENT("05", "Payment"),
    ERROR_CORRECTION("15", "Error Correction"),
    REVERSAL("25", "Reversal");

    private final String code;
    private final String description;

}
