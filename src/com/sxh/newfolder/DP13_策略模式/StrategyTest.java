package com.sxh.newfolder.DP13_策略模式;

import com.sxh.newfolder.DP13_策略模式.DP_13.公式计算.ICalculator;
import com.sxh.newfolder.DP13_策略模式.DP_13.公式计算.Minus;
import com.sxh.newfolder.DP13_策略模式.DP_13.公式计算.Mul;
import com.sxh.newfolder.DP13_策略模式.DP_13.公式计算.Plus;
import com.sxh.newfolder.DP13_策略模式.DP_13.商场促销.Dianshang618;
import com.sxh.newfolder.DP13_策略模式.DP_13.商场促销.PriceContext;
import com.sxh.newfolder.DP13_策略模式.DP_13.商场促销.Shuang11;

/**
 * 策略模式测试类
 * @author 一池春水倾半城
 * @date 2019/12/28 16:52
 */
public class StrategyTest {
    public static void main(String[] args) {
        plus();
        minus();
        mul();
        Shaung11();
        Dianshang618();
    }

    private static void plus() {
        System.out.println(" ================2 + 8 加法运算");
        ICalculator calculator = new Plus();
        double result = calculator.calculate("2+ 8");
        System.out.println("2+ 8 = " + result);
    }
    private static void minus() {
        System.out.println(" ================2 - 8 减法运算");
        ICalculator calculator = new Minus();
        double result = calculator.calculate("2  - 8");
        System.out.println("2  - 8 = " + result);
    }
    private static void mul() {
        System.out.println(" ================2*8 乘法运算");
        ICalculator calculator = new Mul();
        double result = calculator.calculate("2*8");
        System.out.println("2*8 = " + result);
    }

    /**
     * 学到这儿，发现其实设计模式中的很多模式都有相似的地方，但实际上它们使用的场景又不一样。
     * 就像现在在学的这个策略模式，分析下来发现它的调用方式和装饰者模式非常相似，都是将一个类封装在另一个类中完成调用；
     * 但它们的区别还是挺大的：装饰者模式主要是用来对已有的类的功能进行拓展；针对于算法而言的，将已有的一些算法类封装起来，使它们能够独立于客户端进行变化，客户端调
     * 而策略模式的意图则是用时只需要调用策略类并传入对应的算法行为就行了。
     *
     * 适用情况：1.在一个系统里面有许多类，它们之间的区别仅在于它们的行为，使用策略模式可以动态地让一个对象在许多行为中选择一种行为
     *          2.一个系统需要动态地在几种算法中选择一种
     *          3.避免使用难以维护的多重条件选择语句(if...else)
     *          4.希望在具体策略类中封装算法和与相关的数据结构
     *
     * 设计模式的学习不是说知道了概念和会敲几个Demo那么简单的，需要深入的理解它们的使用场景和每一个模式之间的区别
     */

    private static void Shaung11() {
        System.out.println(" ===============天猫双十一大促");
        double totalPrice = 785.0;
        System.out.println("商品原价：" + totalPrice + "￥");
        PriceContext context = new PriceContext(new Shuang11());
        double discount = context.discount(totalPrice);
        System.out.println("折后价格：" + discount + "￥");
    }

    private static void Dianshang618() {
        System.out.println(" ===============年中618狂欢！");
        double totalPrice = 1000;
        System.out.println("商品原价：" + totalPrice + "￥");
        PriceContext context = new PriceContext(new Dianshang618());
        double discount = context.discount(totalPrice);
        System.out.println("折后价格：" + discount + "￥");
    }
}
