package com.payments.domain.valueobject;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AustralianState {

    ACT("ACT", "Australian Capital Territory"),
    NSW("NSW", "New South Wales"),
    NT("NT", "Northern Territory"),
    QLD("QLD", "Queensland"),
    SA("SA", "South Australia"),
    TAS("TAS", "Tasmania"),
    VIC("VIC", "Victoria"),
    WA("WA", "Western Australia");

    private final String code;
    private final String name;

}
