package com.payments.domain.valueobject.npp;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum NPPServiceLevel {

    NONE_01("npp.msg.01-none.01", "npp.msg.01", "none.01", "No Overlay Basic Messaging"),
    SCT_04_CLEARING("npp.clear.01-sct.04", "npp.clear.01", "sct.04", "SCT Clearing"),
    SCT_04_SETTLEMENT("npp.stlmnt.01-sct.04", "npp.stlmnt.01", "sct.04", "SCT Settlement"),
    X2P1_CLEARING("npp.clear.01-x2p1.04", "npp.clear.01", "x2p1.04", "X2P1 Clearing"),
    X2P1_SETTLEMENT("npp.stlmnt.01-x2p1.04", "npp.stlmnt.01", "x2p1.04", "X2P1 Settlement"),
    CATSCT_CLEARING("npp.clear.01-catsct.01", "npp.clear.01", "catsct.01", "CATSCT Clearing"),
    CATSCT_SETTLEMENT("npp.stlmnt.01-catsct.01", "npp.stlmnt.01", "catsct.01", "CATSCT Settlement"),
    MPIS("npp.mps.01-mpis.01", "npp.mps.01", "mpis.01", "Mandate Payment Initiation"),
    SCT_XBRDR_CLEARING("npp.clear.01-sctxbrdr.01", "npp.clear.01", "sctxbrdr.01", "IFTI Clearing"),
    SCT_XBRDR_SETTLEMENT("npp.stlmnt.01-sctxbrdr.01", "npp.stlmnt.01", "sctxbrdr.01", "IFTI Settlement"),
    GCT_XBRDR_CLEARING("npp.clear.01-gcctxbrdr.01", "npp.clear.01", "gcctxbrdr.01", "GPI Instant Clearing"),
    GCT_XBRDR_SETTLEMENT("npp.stlmnt.01-gcctxbrdr.01", "npp.stlmnt.01", "gcctxbrdr.01", "GPI Instant Settlement");

    private final String serviceName;
    private final String clearingServiceId;  // BI Service ID (Clearing)
    private final String settlementServiceId; // BO Service ID (Settlement)
    private final String description;
}
