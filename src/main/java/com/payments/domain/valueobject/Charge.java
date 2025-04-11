package com.payments.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Charge {
    private final String chargeBearer;
    private final String chargeType;
    private final InstructedAmount instructedAmount;
}
