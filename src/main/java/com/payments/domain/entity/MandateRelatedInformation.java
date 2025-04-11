package com.payments.domain.entity;

import com.payments.domain.valueobject.CategoryPurposeCode;
import com.payments.domain.valueobject.Classification;
import com.payments.domain.valueobject.FrequencyType;
import com.payments.domain.valueobject.id.MandateIdentification;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MandateRelatedInformation extends BaseEntity<MandateIdentification> {

    private final CategoryPurposeCode categoryPurposeCode;
    private final Classification classification;
    private final LocalDateTime finalPaymentDateTime;
    private final LocalDateTime firstPaymentDateTime;
    private final String reason;
    private final LocalDateTime recurringPaymentDateTime;
    private final FrequencyType frequency;


    public MandateRelatedInformation(MandateIdentification mandateIdentification, CategoryPurposeCode categoryPurposeCode, Classification classification, LocalDateTime finalPaymentDateTime, LocalDateTime firstPaymentDateTime, String reason, LocalDateTime recurringPaymentDateTime, FrequencyType frequency) {
        super(mandateIdentification);
        this.categoryPurposeCode = categoryPurposeCode;
        this.classification = classification;
        this.finalPaymentDateTime = finalPaymentDateTime;
        this.firstPaymentDateTime = firstPaymentDateTime;
        this.reason = reason;
        this.recurringPaymentDateTime = recurringPaymentDateTime;
        this.frequency = frequency;
    }
}
