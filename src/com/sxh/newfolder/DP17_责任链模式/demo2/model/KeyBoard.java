package com.sxh.newfolder.DP17_责任链模式.demo2.model;

/**
 * @author sxh
 * @date 2020/1/20
 */
public class KeyBoard {
    // 键盘品牌
    private String name;

    public KeyBoard(String name) {
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
        return "KeyBoard{" +
                "name='" + name + '\'' +
                '}';
    }
}
