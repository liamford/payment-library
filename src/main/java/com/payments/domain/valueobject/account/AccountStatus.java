package com.payments.domain.valueobject.account;

public enum AccountStatus {

    OPEN("Open"),
    CLOSED("Closed"),
    UNKNOWN("Unknown");

    private final String status;

    AccountStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static AccountStatus fromString(String status) {
        for (AccountStatus accountStatus : AccountStatus.values()) {
            if (accountStatus.getStatus().equalsIgnoreCase(status)) {
                return accountStatus;
            }
        }
        throw new IllegalArgumentException("Unknown status: " + status);
    }
}
