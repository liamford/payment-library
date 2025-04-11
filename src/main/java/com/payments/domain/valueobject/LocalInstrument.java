package com.payments.domain.valueobject;

import java.util.Objects;

public sealed abstract class LocalInstrument permits DomesticLocalInstrument, InternationalLocalInstrument {
    protected final String value;

    protected LocalInstrument(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalInstrument that = (LocalInstrument) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
