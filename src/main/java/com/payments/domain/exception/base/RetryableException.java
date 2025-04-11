package com.payments.domain.exception.base;

public abstract class RetryableException extends DomainException {
  public RetryableException(String message) {
    super(message);
  }

  public RetryableException(String message, Throwable cause) {
    super(message, cause);
  }

  @Override
  public boolean isRetryable() {
    return true;
  }
}
