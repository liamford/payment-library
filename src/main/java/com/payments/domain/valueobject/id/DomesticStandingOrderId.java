package com.payments.domain.valueobject.id;

import java.util.UUID;

/**
 * OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic standing order resource.
 */

public class DomesticStandingOrderId extends BaseId<UUID> {

    /**
     * Constructs a DomesticStandingOrderId with the specified UUID value.
     *
     * @param value The UUID value representing the consent ID.
     */
    public DomesticStandingOrderId(UUID value) {
        super(value);
    }
}
