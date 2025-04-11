package com.payments.domain.valueobject;

import java.util.Arrays;
import java.util.Objects;

public final class BeneficiaryAccountType {
    private final Type type;

    public BeneficiaryAccountType(Type type) {
        this.type = Objects.requireNonNull(type, "BeneficiaryAccountType is required");
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeneficiaryAccountType that = (BeneficiaryAccountType) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return type.name();
    }

    public enum Type {
        CONSUMER, BUSINESS, CHARITY, GOVERNMENT, UNKNOWN;

        public static Type fromString(String value) {
            return Arrays.stream(values())
                    .filter(t -> t.name().equalsIgnoreCase(value))
                    .findFirst()
                    .orElse(UNKNOWN);
        }
    }
}
