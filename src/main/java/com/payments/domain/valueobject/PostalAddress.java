package com.payments.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class PostalAddress {

    private final AddressType addressType; // Optional: e.g., RESIDENTIAL, BUSINESS
    private final String department; // Optional
    private final String subDepartment; // Optional
    private final String streetName; // Optional
    private final String buildingNumber; // Optional
    private final String postCode; // Optional: e.g., "SW1A 1AA"
    private final String townName; // Optional: e.g., "London"
    private final String countrySubDivision; // Optional: e.g., "Greater London"
    private final String country; // Recommended: ISO 3166-1 alpha-2 code, e.g., "GB"
    private final List<String> addressLines; // Optional: Unstructured lines, max 2 in OBUK
}
