package com.payments.domain.valueobject.id;

public abstract class AccountIdentification extends BaseId<String>{
    /**
     * Constructs an AccountIdentification with the specified String value.
     *
     * @param value The String value representing the account identification.
     */
    protected AccountIdentification(String value) {
        super(value);
    }
}
