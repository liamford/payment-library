package com.payments.domain.aggregate;

import com.payments.domain.entity.BaseStandingOrder;
import com.payments.domain.entity.StandingOrderStatus;
import com.payments.domain.valueobject.Authorisation;
import com.payments.domain.valueobject.id.CorrelationId;
import com.payments.domain.valueobject.id.StandingOrderId;
import lombok.Getter;

import java.util.List;

@Getter
public class StandingOrderAggregate extends AggregateRoot<StandingOrderId>{

    private final CorrelationId correlationId;
    private final BaseStandingOrder baseStandingOrder;
    private final Authorisation authorisation;
    private List<StandingOrderStatus> paymentStatusList;
    private StandingOrderStatus currentStatusCode;


    public StandingOrderAggregate(StandingOrderId id, CorrelationId correlationId, BaseStandingOrder baseStandingOrder, Authorisation authorisation) {
        super(id);
        this.correlationId = correlationId;
        this.baseStandingOrder = baseStandingOrder;
        this.authorisation = authorisation;
    }



}
