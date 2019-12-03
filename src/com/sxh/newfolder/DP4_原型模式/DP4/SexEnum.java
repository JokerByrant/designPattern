package com.sxh.newfolder.DP4_原型模式.DP4;

/**
 * @author 一池春水倾半城
 * @date 2019/12/3
 */
public enum SexEnum {
    MALE("男", 0),
    FEMALE("女",1);

    private String name;
    private int value;

    SexEnum(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
