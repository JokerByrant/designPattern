package com.sxh.history.builder.builder2;

/**
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class Client {
    public static void main(String[] args) {
        // 装修工人1装修房间
        Decorator d1 = new Decorator1();
        // 项目经理指挥装修工人1进行装修
        ProjectManager manager = new ProjectManager(d1);
        // 开始装修
        LivingRoom livingRoom = manager.decorate();
        // 展示装修成果
        System.out.println(livingRoom);
    }
}
