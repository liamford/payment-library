package com.payments.domain.aggregate;

import com.payments.domain.entity.BasePayment;
import com.payments.domain.entity.PaymentStatus;
import com.payments.domain.event.PaymentInitiatedEvent;
import com.payments.domain.valueobject.Authorisation;
import com.payments.domain.valueobject.PaymentStatusCode;
import com.payments.domain.valueobject.id.AccountId;
import com.payments.domain.valueobject.id.CorrelationId;
import com.payments.domain.valueobject.id.PaymentId;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PaymentAggregate extends AggregateRoot<PaymentId>{

    private final CorrelationId correlationId;
    private final BasePayment payment;
    private final Authorisation authorisation;
    private List<PaymentStatus> paymentStatusList;
    private PaymentStatusCode currentStatusCode;
    private AccountId debtorAccountId;
    private AccountId creditorAccountId;
    private List<Object> domainEvents;

    public PaymentAggregate(PaymentId id, CorrelationId correlationId, BasePayment payment, Authorisation authorisation, AccountId debtorAccountId, AccountId creditorAccountId) {
        super(id);
        this.correlationId = correlationId;
        this.payment = payment;
        this.authorisation = authorisation;
        this.debtorAccountId = debtorAccountId;
        this.creditorAccountId = creditorAccountId;
        this.domainEvents = new java.util.ArrayList<>();
        // Raise domain event for creation
        this.domainEvents.add(new PaymentInitiatedEvent(id));
    }

    public void addPaymentStatus(PaymentStatus newStatus) {
        this.paymentStatusList.add(newStatus);
        this.currentStatusCode = newStatus.getStatusCode();
        // Optionally, raise a domain event for status change
    }

    public List<Object> getDomainEvents() {
        return domainEvents;
    }

    public void clearDomainEvents() {
        this.domainEvents.clear();
    }

}
