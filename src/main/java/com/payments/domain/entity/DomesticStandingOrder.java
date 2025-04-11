package com.payments.domain.entity;

import com.payments.domain.valueobject.account.Account;
import com.payments.domain.valueobject.id.StandingOrderId;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DomesticStandingOrder extends BaseStandingOrder{


    private Account refundAccount;

    public DomesticStandingOrder(StandingOrderId standingOrderId, LocalDateTime creationDateTime, MandateRelatedInformation mandateRelatedInformation) {
        super(standingOrderId, creationDateTime, mandateRelatedInformation);
    }
}
