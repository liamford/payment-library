package com.payments.domain.policy.bpay;

import com.payments.domain.entity.DomesticPayment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BpayPolicyProvider {
    private final List<BpayPaymentPolicy> policies;

    public BpayPolicyProvider(List<BpayPaymentPolicy> policies) {
        this.policies = policies;
    }

    public boolean evaluateAll(DomesticPayment context) {
        return policies.stream().allMatch(p -> p.isSatisfiedBy(context));
    }

    public List<String> getFailedPolicies(DomesticPayment context) {
        return policies.stream()
                .filter(p -> !p.isSatisfiedBy(context))
                .map(BpayPaymentPolicy::getPolicyName)
                .toList();
    }
}
