package com.payments.domain.exception;

import com.payments.domain.exception.base.NonRetryableException;

public class PaymentPolicyException extends NonRetryableException {
    public PaymentPolicyException(String message) {
        super(message);
    }

}
