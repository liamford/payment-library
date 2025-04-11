package com.payments.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class ReferredDocumentInformation {
    private final String code; // Remittance code (e.g., CINV)
    private final String issuer; // Remittance issuer (e.g., Issuer01)
    private final String number; // Remittance number (e.g., Number_01)
    private final ZonedDateTime relatedDate; // Remittance related date
    private final List<String> lineDetails; // List of line details

    // You can also add a static factory method for convenience
    public static ReferredDocumentInformation of(String code, String issuer, String number, ZonedDateTime relatedDate, List<String> lineDetails) {
        return new ReferredDocumentInformation(code, issuer, number, relatedDate, lineDetails);
    }
}
