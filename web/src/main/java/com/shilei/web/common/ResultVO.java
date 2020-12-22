package com.shilei.web.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;

@Data
@NoArgsConstructor
public class ResultVO {
    @Basic
    private boolean rFlag = true;

    @Basic
    private String rInfo;

    public ResultVO(String rInfo) {
        this.rInfo = rInfo;
    }

    public ResultVO(boolean rFlag) {
        this.rFlag = rFlag;
    }

    public ResultVO(boolean rFlag, String rInfo) {
        this.rFlag = rFlag;
        this.rInfo = rInfo;
    }

    public ResultVO error(String rInfo){
        this.rFlag = false;
        this.rInfo = rInfo;
        return this;
    }
}
