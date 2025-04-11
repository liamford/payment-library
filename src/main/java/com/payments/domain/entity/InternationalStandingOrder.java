package com.payments.domain.entity;

import com.payments.domain.valueobject.ChargeBearer;
import com.payments.domain.valueobject.account.Account;
import com.payments.domain.valueobject.account.Agent;
import com.payments.domain.valueobject.id.StandingOrderId;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
public class InternationalStandingOrder extends BaseStandingOrder{


    private Account refundAccount;
    private Agent refundAgent;
    private Agent refundCreditor;
    private ChargeBearer chargeBearer;

    public InternationalStandingOrder(StandingOrderId standingOrderId, LocalDateTime creationDateTime, MandateRelatedInformation mandateRelatedInformation) {
        super(standingOrderId, creationDateTime, mandateRelatedInformation);
    }
}
