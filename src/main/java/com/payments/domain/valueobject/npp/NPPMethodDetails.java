package com.payments.domain.valueobject.npp;

import com.payments.domain.valueobject.PaymentMethodDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class NPPMethodDetails extends PaymentMethodDetails {

    private final NPPServiceLevel clearingSystemServiceLevel; // Service level
    private final NPPServiceLevel settlementServiceLevel; // Settlement service level
    private final String clearingSystemMemberId; // Direct participant routing
    private final String instructionForNextAgent;
    private final String instructionForDebtorAgent;
    private final String instructionForCreditorAgent;

}
