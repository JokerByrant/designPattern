package com.sxh.newfolder.DP17_责任链模式.demo2.model;

/**
 * @author sxh
 * @date 2020/1/20
 */
public class Mouse {
    // 鼠标品牌
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                '}';
    }
}
