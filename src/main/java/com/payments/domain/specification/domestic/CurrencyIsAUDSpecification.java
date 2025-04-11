package com.payments.domain.specification.domestic;

import com.payments.domain.entity.DomesticPayment;
import com.payments.domain.specification.BaseSpecification;

public class CurrencyIsAUDSpecification implements BaseSpecification<DomesticPayment> {
    @Override
    public boolean isSatisfiedBy(DomesticPayment candidate) {
        return candidate.getInstructedAmount().getCurrency().equals("AUD");
    }

    @Override
    public String toString() {
        return "CurrencyIsAUDSpecification";
    }
}
