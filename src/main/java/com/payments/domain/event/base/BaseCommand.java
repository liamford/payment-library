package com.payments.domain.event.base;

import java.time.Instant;

public abstract class BaseCommand<ID> {
    private final ID id;  // Generic ID (could be PaymentId, CorrelationId, etc.)
    private final Instant timestamp;

    // Constructor accepting generic ID type
    protected BaseCommand(ID id) {
        this.id = id;
        this.timestamp = Instant.now();
    }

    // Get the ID (could be aggregate ID, entity ID, or value object ID)
    public ID getId() {
        return id;
    }

    // Get the timestamp of when the command was created
    public Instant getTimestamp() {
        return timestamp;
    }

    // Abstract method for command name (overridden by concrete commands)
    public abstract String getCommandName();
    public abstract String getServiceName();
}
