package com.sxh.newfolder.DP12_享元模式;

import com.sxh.newfolder.DP12_享元模式.DP_12.ShapeFactory;

/**
 * 享元模式测试类
 * @author 一池春水倾半城
 * @date 2019/12/28 15:30
 */
public class FlyWeightTest {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.getCircle("red");
        factory.getCircle("blue");
        factory.getCircle("red");
        factory.getCircle("green");
        factory.getCircle("black");
        factory.getCircle("blue");
        factory.getCircle("green");
        System.out.println("==================================");
        factory.showAllCircles();
        System.out.println("==================================");
        System.out.println("实际创建的圆形数量：" + factory.size());
    }

    /**
     * 享元模式主要用于减少创建对象的数量，以减少内存和提高性能。通过尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。
     * 在享元模式中可以共享的相同内容称为内部状态(IntrinsicState)，而那些需要外部环境来设置的不能共享的内容称为外部状态(Extrinsic State)，
     * 由于区分了内部状态和外部状态，因此可以通过设置不同的外部状态使得相同的对象可以具有一些不同的特征，而相同的内部状态是可以共享的。
     * 例如本例中的Circle就可以看做是内部状态，而Circle的颜色则是外部状态，内部状态是不变的，外部状态则由客户端动态指定。
     * 使用场景：1.一个系统有大量相同或者相似的对象，由于这类对象的大量使用，造成内存的大量耗费；
     *          2.对象的大部分状态都可以外部化，可以将这些外部状态传入对象中；
     *          3.多次重复使用享元对象。
     */
}
