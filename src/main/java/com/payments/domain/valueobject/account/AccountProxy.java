package com.payments.domain.valueobject.account;


import lombok.Getter;

import java.util.Objects;

@Getter
public class AccountProxy {

    private final String value;
    private final AccountProxyType type;

    public AccountProxy(String value, AccountProxyType type) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("PayId cannot be null or empty.");
        }
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public AccountProxyType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountProxy accountProxy = (AccountProxy) o;
        return value.equals(accountProxy.value) && type == accountProxy.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }

    @Override
    public String toString() {
        return value + " (" + type + ")";
    }
}
