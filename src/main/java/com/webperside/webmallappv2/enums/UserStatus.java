package com.webperside.webmallappv2.enums;

public enum UserStatus {
    DEACTIVE(0),
    APPROVED(1),
    NEW(2),
    BLOCKED(3);

    private final byte value;

    UserStatus(int value) {
        this.value = (byte) value;
    }

    public byte getValue() {
        return value;
    }

    public static UserStatus getByValue(int value){
        for(UserStatus status: values()){
            if(status.getValue() == value){
                return status;
            }
        }
        return null;
    }
}