package com.payments.domain.valueobject;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.Objects;


@Getter
public final class ExchangeRateInformation {
    private final String contractIdentification; // Optional
    private final BigDecimal exchangeRate; // Optional
    private final RateType rateType; // Required
    private final Currency unitCurrency; // Required

    public ExchangeRateInformation(String contractIdentification, BigDecimal exchangeRate, RateType rateType, Currency unitCurrency) {
        this.contractIdentification = contractIdentification;
        this.exchangeRate = validateExchangeRate(exchangeRate);
        this.rateType = Objects.requireNonNull(rateType, "RateType is required");
        this.unitCurrency = Objects.requireNonNull(unitCurrency, "unitCurrency is required");;
    }

    private BigDecimal validateExchangeRate(BigDecimal exchangeRate) {
        if (exchangeRate != null && exchangeRate.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Exchange rate must be positive if provided");
        }
        return exchangeRate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExchangeRateInformation that = (ExchangeRateInformation) o;
        return Objects.equals(contractIdentification, that.contractIdentification) &&
                Objects.equals(exchangeRate, that.exchangeRate) &&
                rateType == that.rateType &&
                Objects.equals(unitCurrency, that.unitCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractIdentification, exchangeRate, rateType, unitCurrency);
    }


}
