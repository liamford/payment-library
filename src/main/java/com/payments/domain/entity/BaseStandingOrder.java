package com.payments.domain.entity;

import com.payments.domain.valueobject.*;
import com.payments.domain.valueobject.account.Account;
import com.payments.domain.valueobject.account.Agent;
import com.payments.domain.valueobject.id.ConsentId;
import com.payments.domain.valueobject.id.StandingOrderId;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public abstract class BaseStandingOrder extends BaseEntity<StandingOrderId>{


    private final LocalDateTime creationDateTime;
    private final MandateRelatedInformation mandateRelatedInformation;


    private ConsentId consentId;
    private LocalDateTime statusUpdateDateTime;
    private InstructedAmount firstPaymentAmount;
    private InstructedAmount recurringPaymentAmount;
    private InstructedAmount finalPaymentAmount;
    private RemittanceInformation remittanceInformation;
    private Account debtorAccount;
    private Account creditorAccount;
    private Agent ultimateDebtor;
    private Agent ultimateCreditor;
    private List<Charge> charges;
    private Risk risk;
    private SupplementaryData supplementaryData;

    public BaseStandingOrder(StandingOrderId standingOrderId,LocalDateTime creationDateTime, MandateRelatedInformation mandateRelatedInformation) {
        super(standingOrderId);
        this.creationDateTime = creationDateTime;
        this.mandateRelatedInformation = mandateRelatedInformation;
    }
}
