package com.payments.domain.service;


import com.payments.domain.entity.DomesticPayment;
import com.payments.domain.exception.PaymentPolicyException;
import com.payments.domain.policy.npp.NppPolicyProvider;

import java.util.List;


public abstract class BaseNppPaymentService {

    private final NppPolicyProvider policyProvider;

    protected BaseNppPaymentService(NppPolicyProvider policyProvider) {
        this.policyProvider = policyProvider;
    }

    /**
     * Processes an NPP payment after evaluating all policies.
     * Calls the abstract hook for the next step if policies pass.
     */
    public void processPayment(DomesticPayment payment) {
        if (!policyProvider.evaluateAll(payment)) {
            List<String> failed = policyProvider.getFailedPolicies(payment);
            throw new PaymentPolicyException("NPP payment policy violation: " + String.join(", ", failed));
        }

        handleValidPayment(payment);
    }

    /**
     * Hook for post-policy business logic to be implemented by microservices.
     */
    protected abstract void handleValidPayment(DomesticPayment payment);
}

