package com.sxh.newfolder.DP17_责任链模式.demo2.filter;

import java.util.HashSet;

/**
 * 抽象过滤器
 * @author sxh
 * @date 2020/1/20
 */
public abstract class AbstractFilter {
    private HashSet<Long> ids = new HashSet<>();

    public void addIds(Long id) {
        this.ids.add(id);
    }

    public HashSet<Long> getIds() {
        return this.ids;
    }
}
