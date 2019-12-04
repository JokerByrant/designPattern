package com.sxh.newfolder.DP5_建造者模式.DP5;

import java.util.ArrayList;
import java.util.List;

/**
 * 汽车类
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class Car {
    // 造一辆汽车需要的部件
    private List<String> parts = new ArrayList<>();

    public List<String> getParts() {
        return parts;
    }

    public void setParts(List<String> parts) {
        this.parts = parts;
    }

    public void addParts(String part) {
        this.parts.add(part);
    }

    @Override
    public String toString() {
        return "Car{" +
                "parts=" + parts +
                '}';
    }
}
