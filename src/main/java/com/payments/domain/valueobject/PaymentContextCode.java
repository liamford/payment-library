package com.payments.domain.valueobject;

import java.util.Arrays;
import java.util.Objects;

public final class PaymentContextCode {
    private final Code code;

    public PaymentContextCode(Code code) {
        this.code = Objects.requireNonNull(code, "PaymentContextCode is required");
    }

    public Code getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentContextCode that = (PaymentContextCode) o;
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
        BILL, MERCHANT, P2P, GOV, CHARITY, LOAN, SALARY, CREDIT, INSURANCE;

        public static Code fromString(String value) {
            return Arrays.stream(values())
                    .filter(t -> t.name().equalsIgnoreCase(value))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("Invalid PaymentContextCode: " + value));
        }
    }
}
