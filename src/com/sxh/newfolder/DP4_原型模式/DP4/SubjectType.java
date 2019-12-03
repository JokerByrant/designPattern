package com.sxh.newfolder.DP4_原型模式.DP4;

/**
 * @author 一池春水倾半城
 * @date 2019/12/3
 */
public enum SubjectType {
    WULI("物理",0),
    YUWEN("语文",1),
    SHUXUE("数学",2),
    YINGYU("英语",3),
    DILI("地理",4);

    private String name;
    private int value;

    SubjectType(String name, int value) {
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
