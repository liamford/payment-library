package com.payments.domain.specification.base;

import com.payments.domain.entity.BasePayment;
import com.payments.domain.specification.BaseSpecification;

public class AmountGreaterThanZeroSpecification implements BaseSpecification<BasePayment> {
    @Override
    public boolean isSatisfiedBy(BasePayment candidate) {
        return Double.parseDouble(candidate.getInstructedAmount().getAmount()) > 0;
    }

    @Override
    public String toString() {
        return "AmountGreaterThanZeroSpecification";
    }
}
