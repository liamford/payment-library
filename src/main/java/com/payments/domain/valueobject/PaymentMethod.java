package com.payments.domain.valueobject;

public enum PaymentMethod {
    NPP,            // New Payments Platform (Faster Payments)
    PAYID,          // PayID payments within NPP
    RTGS,           // Real-Time Gross Settlement (High-value payments)
    BPAY,           // Bill payment service
    DIRECT_DEBIT,   // Recurring payments
    FUND_TRANSFER,  // Generic account-to-account transfer
    INTERNATIONAL_WIRE, // International Wire Transfer
    BULK_NPP,       // Bulk NPP Payments
    BULK_BACS,      // Bulk BACS payments.
    BRANCH_DEPOSIT, // Cash or cheque deposit at a branch.
    BRANCH_WITHDRAWAL, // Cash withdrawal at a branch.
    ATM_WITHDRAWAL, // Cash withdrawal at an ATM.
    ATM_DEPOSIT, // Cash or cheque deposit at an ATM.
}
