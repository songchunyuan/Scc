package com.zeei.ktp.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PageResult<T> {
    /**
     *
     */
    @JsonProperty("total")
    private Long totalPage;
    /**
     * 分页数据
     */
    @JsonProperty("rows")
    private List<T> data;

    /**
     * 控构造器
     */
    public PageResult() {
    }

    public PageResult(Long totalPage, List<T> data) {
        this.totalPage = totalPage;
        this.data = data;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}