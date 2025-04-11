package com.payments.domain.entity;

import com.payments.domain.valueobject.*;
import com.payments.domain.valueobject.account.Account;
import com.payments.domain.valueobject.account.Agent;
import com.payments.domain.valueobject.id.ConsentId;
import com.payments.domain.valueobject.id.EndToEndIdentification;
import com.payments.domain.valueobject.id.InstructionIdentification;
import com.payments.domain.valueobject.id.PaymentId;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class BasePayment extends BaseEntity<PaymentId>{

    private final InstructionIdentification instructionIdentification;
    private final EndToEndIdentification endToEndIdentification;
    private final InstructedAmount instructedAmount;
    private final LocalInstrument localInstrument;
    private final InstructionPriority instructionPriority;


    private ConsentId consentId;
    private Account debtorAccount;
    private Account creditorAccount;
    private SupplementaryData supplementaryData;
    private String serviceLevel;
    private Agent creditorAgent;
    private Agent debtorAgent;
    private Agent ultimateDebtor;
    private Agent ultimateCreditor;
    private ProcessingDetails processingDetails;
    private PostalAddress creditorPostalAddress;
    private RemittanceInformation remittanceInformation;
    private List<Charge> charges;
    private Risk risk;

    protected BasePayment(PaymentId paymentId, InstructionIdentification instructionIdentification, EndToEndIdentification endToEndIdentification, InstructedAmount instructedAmount, LocalInstrument localInstrument, InstructionPriority instructionPriority) {
        super(paymentId);
        this.instructionIdentification = instructionIdentification;
        this.endToEndIdentification = endToEndIdentification;
        this.instructedAmount = instructedAmount;
        this.localInstrument = localInstrument;
        this.instructionPriority = instructionPriority;
    }



}
