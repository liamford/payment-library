package com.payments.domain.valueobject.bpay;

import com.payments.domain.valueobject.AustralianState;
import com.payments.domain.valueobject.PaymentMethodDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class BPAYMethodDetails extends PaymentMethodDetails {

    private final BpayInstructionType instructionType;
    private final AustralianState stateOfPayment;
    private final String billerCode;
    private final String billerName;
    private final String crn;
    private final BpayPaymentMethod paymentMethod;
    private final BpayEntryMethod entryMethod;
    private final String transactionReferenceNumber;

}
