package com.payments.domain.event.notification;

import com.payments.domain.event.base.BaseNotification;
import com.payments.domain.valueobject.id.PaymentId;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class PaymentLimitExceededNotification extends BaseNotification<PaymentId> {

    private final BigDecimal attemptedAmount;
    private final BigDecimal allowedLimit;

    protected PaymentLimitExceededNotification(PaymentId paymentId, String type, String source, BigDecimal attemptedAmount, BigDecimal allowedLimit) {
        super(paymentId, type, source);
        this.attemptedAmount = attemptedAmount;
        this.allowedLimit = allowedLimit;
    }
}
