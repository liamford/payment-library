package com.payments.domain.valueobject;

public enum AuthorisationStatus {
    AUTHORISED("Authorised"),
    AWAITING_AUTHORISATION("AwaitingAuthorisation"),
    CONSUMED("Consumed"),
    REJECTED("Rejected");

    private final String status;

    AuthorisationStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static AuthorisationStatus fromString(String status) {
        for (AuthorisationStatus statusEnum : AuthorisationStatus.values()) {
            if (statusEnum.status.equalsIgnoreCase(status)) {
                return statusEnum;
            }
        }
        throw new IllegalArgumentException("Unknown status: " + status);
    }
}
