package com.payments.domain.valueobject;

import lombok.Getter;

@Getter
public enum ChargeBearer {
    BORN_BY_CREDITOR,
    BORN_BY_DEBTOR,
    FOLLOWING_SERVICE_LEVEL,
    SHARED;
}
