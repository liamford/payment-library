package com.payments.domain.valueobject;

import lombok.Getter;

@Getter
public enum StandingOrderStatus {
    INCOMPLETE("INCO", "Incomplete"),
    CANCELLED("CANC", "Cancelled"),
    PENDING("PDNG", "Pending"),
    ACCEPTED_TECHNICAL_VALIDATION("ACTC", "Accepted Technical Validation"),
    PARTIALLY_ACCEPTED_TECHNICAL_CORRECTION("PATC", "Partially Accepted Technical Correction"),
    ACCEPTED_CUSTOMER_PROFILE("ACCP", "Accepted Customer Profile"),
    ACCEPTED_FUNDS_CHECKED("ACFC", "Accepted Funds Checked"),
    ACCEPTED_SETTLEMENT_IN_PROCESS("ACSP", "Accepted Settlement in Process"),
    ACCEPTED_WITH_CHANGE("ACWC", "Accepted with Change"),
    ACCEPTED_SETTLEMENT_COMPLETED("ACSC", "Accepted Settlement Completed"),
    ACCEPTED_WITH_PARTIAL_PAYMENT("ACWP", "Accepted with Partial Payment"),
    ACCEPTED_CREDIT_SETTLEMENT_COMPLETED("ACCC", "Accepted Credit Settlement Completed"),
    BLOCKED("BLCK", "Blocked"),
    REJECTED("RJCT", "Rejected"),
    RECEIVED("RCVD", "Received");

    private final String code;
    private final String description;

    StandingOrderStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
