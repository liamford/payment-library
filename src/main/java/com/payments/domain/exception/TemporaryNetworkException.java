package com.payments.domain.exception;

import com.payments.domain.exception.base.RetryableException;

public class TemporaryNetworkException extends RetryableException {
    public TemporaryNetworkException(String message) {
        super(message);
    }

    public TemporaryNetworkException(String message, Throwable cause) {
        super(message, cause);
    }
}
