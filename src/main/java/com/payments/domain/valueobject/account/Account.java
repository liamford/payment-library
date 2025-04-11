package com.payments.domain.valueobject.account;

import com.payments.domain.valueobject.Bsb;
import com.payments.domain.valueobject.id.AccountIdentification;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@ToString
@Setter
public class Account {

    private AccountIdentification accountIdentification; // Primary account identifier
    private AccountIdentification secondaryAccountIdentification; // Secondary account identifier (optional)
    private AccountNumber accountNumber; // Account number (if applicable)
    private Bsb bsb; // BSB (Bank-State-Branch) code (if applicable)
    private AccountProxy accountProxy; // PayId (if applicable)
    private String accountName;
    private AccountStatus accountStatus; // Status of the account (e.g., Open, Closed)


    /**
     * Constructs an Account using AccountIdentification (i.e., PayID) and accountName.
     */
    public Account(AccountIdentification accountIdentification, AccountIdentification secondaryAccountIdentification,
                   AccountProxy accountProxy, String accountName) {
        if (accountIdentification == null && accountProxy == null) {
            throw new IllegalArgumentException("Account identification or PayId must be provided.");
        }
        if (accountName == null || accountName.isEmpty()) {
            throw new IllegalArgumentException("Account name cannot be null or empty.");
        }
        this.accountIdentification = accountIdentification;
        this.secondaryAccountIdentification = secondaryAccountIdentification;
        this.accountNumber = null;
        this.bsb = null;
        this.accountProxy = accountProxy;
        this.accountName = accountName;
    }

    /**
     * Constructs an Account using AccountNumber, BSB (traditional account), and accountName.
     */
    public Account(AccountNumber accountNumber, Bsb bsb, String accountName) {
        if (accountNumber == null || bsb == null) {
            throw new IllegalArgumentException("Account number and BSB cannot be null.");
        }
        if (accountName == null || accountName.isEmpty()) {
            throw new IllegalArgumentException("Account name cannot be null or empty.");
        }
        this.accountIdentification = null;
        this.secondaryAccountIdentification = null;
        this.accountNumber = accountNumber;
        this.bsb = bsb;
        this.accountProxy = null;
        this.accountName = accountName;
    }

    // Validation method to ensure one of the combinations is provided
    public boolean isValid() {
        // Either accountIdentification OR both accountNumber + bsb must be present
        return (accountIdentification != null && accountNumber == null && bsb == null) ||
                (accountIdentification == null && accountNumber != null && bsb != null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountIdentification, account.accountIdentification) &&
                Objects.equals(secondaryAccountIdentification, account.secondaryAccountIdentification) &&
                Objects.equals(accountNumber, account.accountNumber) &&
                Objects.equals(bsb, account.bsb) &&
                Objects.equals(accountProxy, account.accountProxy) &&
                Objects.equals(accountName, account.accountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountIdentification, secondaryAccountIdentification, accountNumber, bsb, accountProxy, accountName);
    }

}
