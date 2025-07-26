package com.payments.domain.policy.npp;


import com.payments.domain.entity.DomesticPayment;
// import org.springframework.stereotype.Component;

// @Component
public class NppBicValidationPolicy implements NppPaymentPolicy {
    @Override
    public boolean isSatisfiedBy(DomesticPayment context) {
        return context.getCreditorAgent().getBic() != null &&
                context.getDebtorAgent().getBic() != null;
    }

    @Override
    public String getPolicyName() {
        return "NPP BIC Validation Policy";
    }

}
