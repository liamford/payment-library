package com.payments.domain.event;

import com.payments.domain.valueobject.id.PaymentId;
import java.time.Instant;

public class PaymentInitiatedEvent {
    private final PaymentId paymentId;
    private final Instant occurredAt;

    public PaymentInitiatedEvent(PaymentId paymentId) {
        this.paymentId = paymentId;
        this.occurredAt = Instant.now();
    }

    public PaymentId getPaymentId() {
        return paymentId;
    }

    public Instant getOccurredAt() {
        return occurredAt;
    }
}
