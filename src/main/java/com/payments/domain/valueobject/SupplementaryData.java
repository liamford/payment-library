package com.payments.domain.valueobject;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collections;
import java.util.Map;

@Getter
@AllArgsConstructor
public class SupplementaryData {

    private final Map<String, String> data; // Immutable key-value store for supplementary data

    public static SupplementaryData of(Map<String, String> data) {
        return new SupplementaryData(Collections.unmodifiableMap(data));
    }

    public String getValue(String key) {
        return data.get(key);
    }
}
