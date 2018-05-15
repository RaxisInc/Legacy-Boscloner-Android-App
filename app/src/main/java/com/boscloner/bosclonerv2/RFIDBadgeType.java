package com.boscloner.bosclonerv2;

public enum RFIDBadgeType {

    HID_PROX_CARD("typeHIDProx"),
    HID_INDALA("HID Indala"),
    EM4100("EM4100"),
    HID_ICLASS_LEGACY("HID iClass Legacy");


    private String value;

    RFIDBadgeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}