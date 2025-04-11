package com.payments.domain.valueobject;

import lombok.Getter;

import java.util.Objects;


@Getter
public class Bsb {
    private final String value;

    public Bsb(String value) {
        if (value == null || !value.matches("\\d{6}")) {
            throw new IllegalArgumentException("Invalid BSB format. Must be a 6-digit number.");
        }
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bsb bsb = (Bsb) o;
        return Objects.equals(value, bsb.value);
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
