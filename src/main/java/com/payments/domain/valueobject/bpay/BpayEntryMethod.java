package com.payments.domain.valueobject.bpay;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BpayEntryMethod {

    UNDEFINED("000", "Undefined"),
    KEY_ENTRY_BY_OPERATOR("001", "Key Entry by Operator"),
    IVR("002", "IVR"),
    ATM_KIOSK("003", "ATM/Kiosk"),
    INTERNET_ONLINE_BANKING("004", "Internet/On-line Banking"),
    BPAY_VIEW("005", "BPAY View"),
    BATCH("006", "Batch"),
    MOBILE_BANKING("007", "Mobile Banking");

    private final String code;
    private final String description;

}
