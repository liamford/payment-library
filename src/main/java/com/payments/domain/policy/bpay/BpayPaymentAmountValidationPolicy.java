package com.payments.domain.policy.bpay;


import com.payments.domain.entity.DomesticPayment;
import com.payments.domain.policy.npp.NppPaymentPolicy;
// import org.springframework.stereotype.Component;

import java.math.BigDecimal;

// @Component
public class BpayPaymentAmountValidationPolicy implements BpayPaymentPolicy {

    private static final double MAX_PAYMENT_AMOUNT = 20000.0;

    @Override
    public boolean isSatisfiedBy(DomesticPayment context) {
        if (context.getInstructedAmount() == null) {
            return false;
        }
        double amount = Double.parseDouble(context.getInstructedAmount().getAmount());
        return amount > MAX_PAYMENT_AMOUNT;
    }

    @Override
    public String getPolicyName() {
        return "BPAY Payment Amount Validation Policy";
    }

}
