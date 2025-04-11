package com.payments.domain.valueobject.account;


import com.payments.domain.valueobject.PostalAddress;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Agent {

    private final String bic;
    private final String lei; // Optional, if applicable
    private final String identification; // Bank’s internal ID or registration number
    private final String name;
    private final PostalAddress postalAddress;
}
