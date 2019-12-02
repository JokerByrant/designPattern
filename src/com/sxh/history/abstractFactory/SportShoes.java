package com.sxh.history.abstractFactory;

/**
 * 运动鞋
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class SportShoes implements Shoes {
    @Override
    public void show() {
        System.out.println("我是一双运动鞋！");
    }
}
