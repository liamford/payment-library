package com.payments.domain.valueobject;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Currency {

    private final String code;

    public Currency(String code) {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Currency code cannot be null or empty");
        }
        if (code.length() != 3) {
            throw new IllegalArgumentException("Currency code must be exactly 3 characters (ISO 4217 format)");
        }
        this.code = code.toUpperCase(); // Ensure consistent case
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return code.equals(currency.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return code;
    }
}
