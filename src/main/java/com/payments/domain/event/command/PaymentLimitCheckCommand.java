package com.payments.domain.event.command;

import com.payments.domain.event.base.BaseCommand;
import com.payments.domain.valueobject.InstructedAmount;
import com.payments.domain.valueobject.LocalInstrument;
import com.payments.domain.valueobject.account.Account;
import com.payments.domain.valueobject.id.PaymentId;
import lombok.Getter;

@Getter
public class PaymentLimitCheckCommand extends BaseCommand<PaymentId> {

    private final Account debitAccount;
    private final InstructedAmount instructedAmount;
    private final LocalInstrument localInstrument;


    public PaymentLimitCheckCommand(PaymentId paymentId,Account debitAccount, InstructedAmount instructedAmount, LocalInstrument localInstrument) {
        super(paymentId);  // Pass PaymentId (aggregate or entity ID)
        this.debitAccount = debitAccount;
        this.instructedAmount = instructedAmount;
        this.localInstrument = localInstrument;
    }

    @Override
    public String getCommandName() {
        return "PaymentLimitCheckCommand";
    }

    @Override
    public String getServiceName() {
        return "Limit-Check-Service";
    }
}
