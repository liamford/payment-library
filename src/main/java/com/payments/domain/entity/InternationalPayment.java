package com.payments.domain.entity;

import com.payments.domain.valueobject.*;
import com.payments.domain.valueobject.account.Account;
import com.payments.domain.valueobject.account.Agent;
import com.payments.domain.valueobject.id.EndToEndIdentification;
import com.payments.domain.valueobject.id.InstructionIdentification;
import com.payments.domain.valueobject.id.PaymentId;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class InternationalPayment extends BasePayment{


    private Account refundAccount;
    private Agent refundAgent;
    private Agent refundCreditor;
    private Currency currencyOfTransfer;
    private ExchangeRateInformation exchangeRateInformation;
    private ChargeBearer chargeBearer;

    public InternationalPayment(PaymentId paymentId, InstructionIdentification instructionIdentification, EndToEndIdentification endToEndIdentification, InstructedAmount instructedAmount, LocalInstrument localInstrument, InstructionPriority instructionPriority) {
        super(paymentId, instructionIdentification, endToEndIdentification, instructedAmount, localInstrument, instructionPriority);
    }
}
