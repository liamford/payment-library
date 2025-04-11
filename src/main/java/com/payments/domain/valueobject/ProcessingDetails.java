package com.payments.domain.valueobject;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProcessingDetails {

    private final PaymentMethod paymentMethod; // The payment method (NPP, RTGS, etc.)
    private final PaymentTransactionType transactionType; // Payment, Refund, etc.
    private final PaymentMethodDetails methodDetails; // Additional details specific to the payment method
}
