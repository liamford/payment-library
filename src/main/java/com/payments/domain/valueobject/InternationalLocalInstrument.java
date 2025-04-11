package com.payments.domain.valueobject;

import java.util.Set;

public final class InternationalLocalInstrument extends LocalInstrument {
    private static final Set<String> VALID_VALUES = Set.of("SWIFT", "RTGS", "SEPA", "CHAPS", "FPS", "BACS", "ACH");

    public InternationalLocalInstrument(String value) {
        super(validate(value));
    }

    private static String validate(String value) {
        if (!VALID_VALUES.contains(value)) {
            throw new IllegalArgumentException("Invalid international local instrument: " + value);
        }
        return value;
    }
}
