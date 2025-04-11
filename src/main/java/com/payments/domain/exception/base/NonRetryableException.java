package com.payments.domain.exception.base;

public abstract class NonRetryableException extends DomainException {
  public NonRetryableException(String message) {
    super(message);
  }

  public NonRetryableException(String message, Throwable cause) {
    super(message, cause);
  }

  @Override
  public boolean isRetryable() {
    return false;
  }
}
