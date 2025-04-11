package com.payments.domain.valueobject;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreditorReferenceInformation {

    private final String code; // Creditor reference code (e.g., DISP)
    private final String issuer; // Creditor reference issuer (e.g., Issuer01)
    private final String reference; // Creditor reference number (e.g., REF_26518)

    public static CreditorReferenceInformation of(String code, String issuer, String reference) {
        return new CreditorReferenceInformation(code, issuer, reference);
    }
}
