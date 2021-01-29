package com.shilei.web.enums;

public enum VipEnum {
    NORMAL("普通",0),
    BRONZE("青铜",1),
    SILVER("白银",2),
    GOLD("黄金",3),
    PLATINUM("铂金",4),
    DIAMOND("钻石",5);

    private String VipName;

    private Integer level;

    public String getVipName() {
        return VipName;
    }

    public void setVipName(String vipName) {
        VipName = vipName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    VipEnum(String vipName, Integer level) {
        VipName = vipName;
        this.level = level;
    }
}
