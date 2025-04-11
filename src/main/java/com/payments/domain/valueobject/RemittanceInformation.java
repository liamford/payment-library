package com.payments.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class RemittanceInformation {
    private List<StructuredRemittanceInformation> structured;
    private List<String> unstructured;

}
