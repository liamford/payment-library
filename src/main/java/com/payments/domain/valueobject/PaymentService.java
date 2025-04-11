package com.payments.domain.valueobject;

import lombok.Getter;

@Getter
public enum PaymentService {
    PAYMENT_INITIATION,
    LIMIT_CHECK,
    FRAUD_CHECK,
    ELIGIBILITY_CHECK,
    PAYMENT_AUTHORIZATION,
    PAYMENT_DEBIT_POSTING,
    PAYMENT_CREDIT_POSTING,
    PAYMENT_SETTLEMENT,
    PAYMENT_CLEARING,
    SANCTIONS_CHECK,
    PAYMENT_ENRICHMENT,
}
