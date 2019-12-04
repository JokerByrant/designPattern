package com.sxh.newfolder.DP6_适配器模式.DP6_test;

/**
 * 测试飞虎到底能不能飞
 * @author 一池春水倾半城
 * @date 2019/12/4 23:46
 */
public class Test {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("孟加拉虎");
        FlyAnimal flyTiger = new FlyTiger(tiger);
        flyTiger.fly();
        flyTiger.eat();

        /**
         * 老虎类是原来就存在的，它包括eat()和run()两个方法。
         * 现在新增一个飞虎类，它属于飞禽，既然是飞禽，那么就应该有飞禽的技能fly()和eat()，但它吃的和老虎一样，那么直接使用原来老虎类中的eat()方法就行了。
         */
    }
}
