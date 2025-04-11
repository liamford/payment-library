package com.payments.domain.valueobject;


import com.payments.domain.valueobject.id.MerchantCustomerIdentification;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
@Getter
public class Risk {
    private final Optional<BeneficiaryAccountType> beneficiaryAccountType; // Optional
    private final Optional<Boolean> beneficiaryPrepopulatedIndicator; // Optional
    private final Optional<CategoryPurposeCode> categoryPurposeCode; // Optional
    private final Optional<Boolean> contractPresentIndicator; // Optional
    private final Optional<String> merchantCategoryCode; // Optional
    private final Optional<MerchantCustomerIdentification> merchantCustomerIdentification; // Optional
    private final Optional<PaymentContextCode> paymentContextCode; // Optional
    private final Optional<PaymentPurposeCode> paymentPurposeCode; // Optional
    private final Optional<PostalAddress> deliveryAddress; // Optional
}
