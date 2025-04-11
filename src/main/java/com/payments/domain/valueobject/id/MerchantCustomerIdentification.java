package com.payments.domain.valueobject.id;

public abstract class MerchantCustomerIdentification extends BaseId<String> {
    /**
     * Constructs an AccountIdentification with the specified String value.
     *
     * @param value The String value representing the account identification.
     */
    protected MerchantCustomerIdentification(String value) {
        super(value);
    }
}
