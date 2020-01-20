package com.sxh.newfolder.DP17_责任链模式.demo2.model;

/**
 * @author sxh
 * @date 2020/1/20
 */
public class Monitor {
    // 尺寸
    private Integer size;

    public Monitor(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "size=" + size +
                '}';
    }
}
