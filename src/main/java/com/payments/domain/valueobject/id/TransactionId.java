package com.payments.domain.valueobject.id;

import java.util.UUID;

/**
 * OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource.
 */

public class TransactionId extends BaseId<UUID> {

    /**
     * Constructs a DomesticPaymentId with the specified UUID value.
     *
     * @param value The UUID value representing the consent ID.
     */
    public TransactionId(UUID value) {
        super(value);
    }
}
