package com.payments.domain.entity;

import com.payments.domain.valueobject.StandingOrderStatusDetail;
import com.payments.domain.valueobject.id.TransactionId;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class StandingOrderStatus extends BaseEntity<TransactionId>{

    private final StandingOrderStatus statusCode;
    private final LocalDateTime statusUpdateDateTime;
    private final StandingOrderStatusDetail statusDetail;


    public StandingOrderStatus(TransactionId transactionId, StandingOrderStatus statusCode, LocalDateTime statusUpdateDateTime, StandingOrderStatusDetail statusDetail) {
        super(transactionId);
        this.statusCode = statusCode;
        this.statusUpdateDateTime = statusUpdateDateTime;
        this.statusDetail = statusDetail;
    }
}
