package com.payments.domain.valueobject.account;

import lombok.Getter;

@Getter
public enum AccountProxyType {
    EMAIL("Email Address"),
    PHONE_NUMBER("Phone Number"),
    ABN("Australian Business Number");

    // Getter method to retrieve the type description
    private final String type; // Description of the proxy type

    // Constructor to initialize the type description
    AccountProxyType(String type) {
        this.type = type;
    }

}
