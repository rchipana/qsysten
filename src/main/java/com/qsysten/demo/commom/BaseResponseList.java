package com.qsysten.demo.commom;

import java.util.List;

public class BaseResponseList <T> {

    private Integer count;
    private Long total;
    private List <T> items;

    public BaseResponseList () {

    }

    public BaseResponseList(List <T> items) {
        this.items = items;
        this.count = items.size();
    }
}
