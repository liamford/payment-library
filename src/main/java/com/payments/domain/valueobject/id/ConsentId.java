package com.payments.domain.valueobject.id;

import java.util.UUID;

/**
 * Represents the unique identifier for a consent resource.
 * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
 */

public class ConsentId extends BaseId<UUID>{

    /**
     * Constructs a ConsentId with the specified UUID value.
     *
     * @param value The UUID value representing the consent ID.
     */
    public ConsentId(UUID value) {
        super(value);
    }
}
