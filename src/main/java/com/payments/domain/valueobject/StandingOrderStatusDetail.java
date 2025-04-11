
package com.payments.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class StandingOrderStatusDetail {
    private final LocalInstrument localInstrument;
    private final StandingOrderStatus status;
    private final String statusReason;
    private final String statusReasonDescription;
}
