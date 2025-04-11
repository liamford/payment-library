package com.payments.domain.entity;

import com.payments.domain.valueobject.InstructedAmount;
import com.payments.domain.valueobject.InstructionPriority;
import com.payments.domain.valueobject.LocalInstrument;
import com.payments.domain.valueobject.account.Account;
import com.payments.domain.valueobject.id.EndToEndIdentification;
import com.payments.domain.valueobject.id.InstructionIdentification;
import com.payments.domain.valueobject.id.PaymentId;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DomesticPayment extends BasePayment{


    private Account refundAccount;

    public DomesticPayment(PaymentId paymentId, InstructionIdentification instructionIdentification, EndToEndIdentification endToEndIdentification, InstructedAmount instructedAmount, LocalInstrument localInstrument, InstructionPriority instructionPriority) {
        super(paymentId, instructionIdentification, endToEndIdentification, instructedAmount, localInstrument, instructionPriority);
    }
}
