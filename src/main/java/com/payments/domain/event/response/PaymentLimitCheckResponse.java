package com.payments.domain.event.response;

import com.payments.domain.event.base.BaseResponse;
import com.payments.domain.valueobject.InstructedAmount;
import com.payments.domain.valueobject.id.PaymentId;
import lombok.Getter;


@Getter
public class PaymentLimitCheckResponse extends BaseResponse<PaymentId> {
    private final boolean isLimitExceeded;
    private final InstructedAmount instructedAmount;

    public PaymentLimitCheckResponse(PaymentId paymentId, boolean isLimitExceeded, InstructedAmount instructedAmount) {
        super(paymentId);
        this.isLimitExceeded = isLimitExceeded;
        this.instructedAmount = instructedAmount;
    }

    @Override
    public String getResponseName() {
        return "PaymentLimitCheckResponse";
    }

    @Override
    public String getServiceName() {
        return "Limit-Check-Service";
    }

    public boolean isLimitExceeded() {
        return isLimitExceeded;
    }
}
