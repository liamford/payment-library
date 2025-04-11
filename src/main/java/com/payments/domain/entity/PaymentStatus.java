package com.payments.domain.entity;

import com.payments.domain.valueobject.PaymentStatusCode;
import com.payments.domain.valueobject.PaymentStatusDetail;
import com.payments.domain.valueobject.id.TransactionId;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PaymentStatus extends BaseEntity<TransactionId>{

    private final PaymentStatusCode statusCode;
    private final LocalDateTime statusUpdateDateTime;
    private final PaymentStatusDetail statusDetail;

    public PaymentStatus(TransactionId transactionId, PaymentStatusCode statusCode, LocalDateTime statusUpdateDateTime, PaymentStatusDetail statusDetail) {
        super(transactionId);
        this.statusCode = statusCode;
        this.statusUpdateDateTime = statusUpdateDateTime;
        this.statusDetail = statusDetail;
    }
}
