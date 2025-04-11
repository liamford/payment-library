package com.payments.domain.valueobject.account;

import lombok.Getter;

import java.util.Objects;


@Getter
public class AccountNumber {

    private final String value;

    public AccountNumber(String value) {
        if (value == null || !value.matches("\\d{6,10}")) {
            throw new IllegalArgumentException("Invalid account number format. Must be between 6 and 10 digits.");
        }
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountNumber that = (AccountNumber) o;
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
