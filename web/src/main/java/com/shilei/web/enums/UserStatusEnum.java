package com.shilei.web.enums;

public enum UserStatusEnum {
    A("Active"),
    D("Delete");

    private String label;

    UserStatusEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String getName() {
        return name();
    }
}
