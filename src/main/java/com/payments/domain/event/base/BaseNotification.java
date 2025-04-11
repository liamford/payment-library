package com.payments.domain.event.base;

import lombok.Getter;

import java.time.Instant;

@Getter
public abstract class BaseNotification<ID> {

    private final ID id;
    private final Instant occurredAt;
    private final String type;
    private final String source;

    protected BaseNotification(ID id, String type, String source) {
        this.id = id;
        this.occurredAt = Instant.now();
        this.type = type;     // e.g., "LIMIT_EXCEEDED", "PAYMENT_INITIATED"
        this.source = source; // e.g., "limit-service", "core-payment-service"
    }

}
