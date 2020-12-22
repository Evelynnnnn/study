package com.shilei.web.common;

import com.alibaba.cloud.context.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@NoArgsConstructor
public class SearchDTO {

    public SearchDTO(Boolean enabledSort) {
        this.enabledSort = enabledSort;
    }

    private Boolean enabledSort;
    private Integer pageNo;
    private Integer pageSize;
    private String orderBy;
    private String dir;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public Pageable toPageable() {

        if (pageNo == null) {
            pageNo = 0;
        }
        if (pageSize == null) {
            pageSize = 50;
        }
        PageRequest pageRequest;
        if (enabledSort != null && enabledSort && StringUtils.isNotEmpty(orderBy)) {
            pageRequest = PageRequest.of(pageNo, pageSize, Sort.by(Sort.Direction.fromString(dir), orderBy));
        } else {
            pageRequest = PageRequest.of(pageNo, pageSize);
        }
        return pageRequest;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
