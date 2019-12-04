package com.sxh.newfolder.DP4_原型模式.DP4;

/**
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public enum SexEnum {
    MALE("男", 0),
    FEMALE("女", 1),
    UNKNOWN("不详", 2);

    private String name;
    private Integer value;

    SexEnum(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }
}
