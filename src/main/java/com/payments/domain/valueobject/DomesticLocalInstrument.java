package com.payments.domain.valueobject;

import java.util.Set;

public final class DomesticLocalInstrument extends LocalInstrument {
    private static final Set<String> VALID_VALUES = Set.of("NPP", "OSKO", "BECS", "BPAY", "Direct_Entry");

    public DomesticLocalInstrument(String value) {
        super(validate(value));
    }

    private static String validate(String value) {
        if (!VALID_VALUES.contains(value)) {
            throw new IllegalArgumentException("Invalid domestic local instrument: " + value);
        }
        return value;
    }
}
