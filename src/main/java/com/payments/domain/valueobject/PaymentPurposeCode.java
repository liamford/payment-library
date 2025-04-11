package com.payments.domain.valueobject;

import java.util.Arrays;
import java.util.Objects;

public final class PaymentPurposeCode {
    private final Code code;

    public PaymentPurposeCode(Code code) {
        this.code = Objects.requireNonNull(code, "PaymentPurposeCode is required");
    }

    public Code getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentPurposeCode that = (PaymentPurposeCode) o;
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
        SALARY, PENSION, TAX, LOAN, DIVIDEND, RENT, CHARITY, INSURANCE, MORTGAGE, GAMBLING, GIFTS;

        public static Code fromString(String value) {
            return Arrays.stream(values())
                    .filter(t -> t.name().equalsIgnoreCase(value))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("Invalid PaymentPurposeCode: " + value));
        }
    }
}
