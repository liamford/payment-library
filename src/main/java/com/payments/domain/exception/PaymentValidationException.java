package com.payments.domain.exception;

import com.payments.domain.exception.base.NonRetryableException;

public class PaymentValidationException extends NonRetryableException {
    public PaymentValidationException(String message) {
        super(message);
    }

}
