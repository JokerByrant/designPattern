package com.sxh.newfolder.DP6_适配器模式.DP6_test;

/**
 * 老虎类
 * @author 一池春水倾半城
 * @date 2019/12/4 23:39
 */
public class Tiger {
    // 老虎的种类名
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 老虎能跑
    public void run() {
        System.out.println("这是一只" + name + "，它正在跑！");
    }

    // 老虎也能吃东西
    public void eat() {
        System.out.println(name + "吃肉，喜欢吃宫保鸡丁、糖醋排骨....");
    }
}
