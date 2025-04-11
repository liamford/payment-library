package com.payments.domain.policy;

public interface PaymentPolicy<T> {
    boolean isSatisfiedBy(T context);
    String getPolicyName();
}
