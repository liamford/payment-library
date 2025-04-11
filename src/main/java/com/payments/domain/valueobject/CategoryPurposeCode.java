package com.payments.domain.valueobject;

import java.util.Arrays;
import java.util.Objects;

public final class CategoryPurposeCode {
    private final Code code;

    public CategoryPurposeCode(Code code) {
        this.code = Objects.requireNonNull(code, "CategoryPurposeCode is required");
    }

    public Code getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryPurposeCode that = (CategoryPurposeCode) o;
        return code == that.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return code.name();
    }

    public enum Code {
        CASH, BILL, SALA, PENS, TAXS, LOAN, DIVI, RENT, CHAR, GAMB, INTE, TRAD;

        public static Code fromString(String value) {
            return Arrays.stream(values())
                    .filter(t -> t.name().equalsIgnoreCase(value))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("Invalid CategoryPurposeCode: " + value));
        }
    }
}
