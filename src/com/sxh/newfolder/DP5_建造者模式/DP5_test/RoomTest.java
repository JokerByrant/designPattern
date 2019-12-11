package com.sxh.newfolder.DP5_建造者模式.DP5_test;

/**
 * @author 一池春水倾半城
 * @date 2019/12/11 22:33
 */
public class RoomTest {
    public static void main(String[] args) {
        // 1.来了个客户1，想给新买的房子来个全套服务，想装修成北欧风的
        RoomDecoration decorator1 = new Decorator1();
        Contractor1 contractor1 = new Contractor1(decorator1);
        Room room1 = contractor1.decorateRoom();
        System.out.println(room1);

        // 2.来了个客户2，想给自己住了许久的房子更改一下风格和翻新一下墙面，比较喜欢中国风的
        RoomDecoration decoration2 = new Decorator2();
        Contractor2 contractor2 = new Contractor2(decoration2);
        Room room2 = contractor2.decorateRoom();
        System.out.println(room2);
    }
}
