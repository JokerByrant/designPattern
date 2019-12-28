package com.sxh.newfolder.DP12_享元模式.DP_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 图形管理工厂，用来创建不同样式的图形
 * @author 一池春水倾半城
 * @date 2019/12/28 15:44
 */
public class ShapeFactory {
    private Map<String, Circle> shapeMap;

    private List<Circle> shapeList;

    public ShapeFactory() {
        this.shapeMap = new HashMap<>();
        this.shapeList = new ArrayList<>();
    }

    public Circle getCircle(String color) {
        Circle circle;

        if (shapeMap.containsKey(color)) {
            System.out.println(color + " ---> 这个颜色的圆形已经创建了，无需new，直接返回");
            circle = shapeMap.get(color);
            shapeList.add(circle);
            return circle;
        }

        circle = new Circle(color);
        shapeMap.put(color, circle);
        shapeList.add(circle);
        return circle;
    }

    public int size() {
        return shapeMap.size();
    }

    public void showAllCircles() {
        shapeList.forEach(c -> c.draw());
    }
}
