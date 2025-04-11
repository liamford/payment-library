package com.payments.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@AllArgsConstructor
@Getter
public class StructuredRemittanceInformation {

    private final List<ReferredDocumentInformation> referredDocumentInformation; // List of referred document information
    private final double referredDocumentAmount; // Amount for the referred document
    private final CreditorReferenceInformation creditorReferenceInformation; // Creditor reference information
    private final String invoicer; // Invoicer information
    private final String invoicee; // Invoicee information
    private final String taxRemittance; // Tax remittance related information
    private final List<String> additionalRemittanceInformation; // Additional remittance information

    public static StructuredRemittanceInformation of(List<ReferredDocumentInformation> referredDocumentInformation, double referredDocumentAmount,
                                          CreditorReferenceInformation creditorReferenceInformation, String invoicer,
                                          String invoicee, String taxRemittance, List<String> additionalRemittanceInformation) {
        return new StructuredRemittanceInformation(referredDocumentInformation, referredDocumentAmount, creditorReferenceInformation,
                invoicer, invoicee, taxRemittance, additionalRemittanceInformation);
    }


}
