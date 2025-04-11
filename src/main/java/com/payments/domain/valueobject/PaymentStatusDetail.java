package com.payments.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentStatusDetail {
    private final PaymentService paymentService;
    private final PaymentStatusCode status;
    private final String statusReason;
    private final String statusReasonDescription;
}
