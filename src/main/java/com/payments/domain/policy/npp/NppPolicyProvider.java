package com.payments.domain.policy.npp;

import com.payments.domain.entity.DomesticPayment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NppPolicyProvider {
    private final List<NppPaymentPolicy> policies;

    public NppPolicyProvider(List<NppPaymentPolicy> policies) {
        this.policies = policies;
    }

    public boolean evaluateAll(DomesticPayment context) {
        return policies.stream().allMatch(p -> p.isSatisfiedBy(context));
    }

    public List<String> getFailedPolicies(DomesticPayment context) {
        return policies.stream()
                .filter(p -> !p.isSatisfiedBy(context))
                .map(NppPaymentPolicy::getPolicyName)
                .toList();
    }
}
