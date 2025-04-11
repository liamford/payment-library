package com.payments.domain.valueobject;


import lombok.Getter;

@Getter
public enum PaymentStatusCode {

    RCVD("RCVD"),   // Received
    PDNG("PDNG"),   // Pending
    ACTC("ACTC"),   // Accepted
    PATC("PATC"),   // Partial Acceptance
    ACCP("ACCP"),   // Accepted by Payee
    ACFC("ACFC"),   // Accepted for Clearing
    ACSP("ACSP"),   // Accepted for Settlement
    ACWC("ACWC"),   // Accepted with Clearing
    ACSC("ACSC"),   // Accepted for Settlement and Clearing
    ACWP("ACWP"),   // Accepted with Partial Settlement
    ACCC("ACCC"),   // Accepted for Complete Clearing
    BLCK("BLCK"),   // Blocked
    RJCT("RJCT");   // Rejected

    private final String statusCode;

    PaymentStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }


}
