package com.payments.domain.valueobject.bpay;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BpayPaymentMethod {

    DEBIT_ACCOUNT("001", "Debit account"),
    VISA("101", "Visa"),
    MASTERCARD("201", "MasterCard"),
    OTHER_CREDIT_CARD("301", "Other Credit Card");

    private final String code;
    private final String description;
}
