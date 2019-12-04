package com.sxh.newfolder.DP4_原型模式.DP4;

/**
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public enum HomeWorkType {
    WULI("物理", 1),
    HUAXUE("化学", 2),
    SHUXUE("数学", 3),
    YINGYU("英语",4);

    private String name;
    private Integer value;

    HomeWorkType(String name, Integer value) {
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
