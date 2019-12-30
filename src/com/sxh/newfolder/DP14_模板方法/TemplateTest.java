package com.sxh.newfolder.DP14_模板方法;

import com.sxh.newfolder.DP14_模板方法.模拟JDBC连接查询.AbstractJdbcTemplate;
import com.sxh.newfolder.DP14_模板方法.模拟JDBC连接查询.GoodsTemplateImpl;
import com.sxh.newfolder.DP14_模板方法.模拟JDBC连接查询.UserTemplateImpl;
import com.sxh.newfolder.DP14_模板方法.游戏.AbstractGame;
import com.sxh.newfolder.DP14_模板方法.游戏.ActionGame;
import com.sxh.newfolder.DP14_模板方法.游戏.FootballGame;

/**
 * 模板方法测试
 * @author sxh
 * @date 2019/12/30
 */
public class TemplateTest {
    public static void main(String[] args) {
        playGame();
        jdbc();
    }

    private static void playGame() {
        AbstractGame fifa = new FootballGame();
        fifa.play();
        System.out.println("************************************************");
        fifa = new ActionGame();
        fifa.play();
    }

    private static void jdbc() {
        System.out.println("====================== 用户数据层操作实现 ");
        AbstractJdbcTemplate userTemplate = new UserTemplateImpl();
        userTemplate.execute("select * from user ");
        System.out.println("====================== 商品数据层操作实现 ");
        AbstractJdbcTemplate goodsTemplate = new GoodsTemplateImpl();
        goodsTemplate.execute("select * from goods ");
    }

    /**
     * 模板方法定义了一个执行算法的步骤(抽象类中的final方法)，并允许子类为一个或多个步骤提供其实践方式。
     * 模板方法使得子类可以不改变一个算法的结构即可重新定义这个算法的某些步骤。
     * 模板方法和策略模式有点像，都是由子类最终实现算法，二者区别是：
     * （1）策略模式定义了一个统一的算法接口，由具体的算法子类实现，所有的算法方法必须暴露给子类，
     *      由子类来实现，这样会产生一个问题，就是在执行算法之前如果有大量的数据准备工作，则会
     *      增加子算法方法块代码的臃肿度，使得大量代码重复得不到复用！
     * （2）模板方法定一个抽象的类，由父类统一定义实现算法的步骤，具体实现延迟到子类，
     *      属于算法"定制"，对特定的重复的算法部分实现了封装，只对扩展的部分暴露给子类！
     *
     *   优点：
     *   想必不用说，我们都可以看出来，模板方法的一个最大的好处就是实现了重复代码的复用！
     *   另外一个就是，扩展很方便！
     *   缺点：
     *   和策略模式一样，也存在子类过多的情况出现，类一多，维护起来的复杂度就增加了！
     *
     *   <p>假如，一个抽象类有4个子类，你可能会说，也就才4个啊，半个小时都能看的透透彻彻了</p>
     *   <p>假如，一个抽象类有100个子类，你可能会皱着眉头说，卧槽，这特么还是人吗，怎么写了这么多？</p>
     *   <p>所以，类并不是越多越能体现系统的健壮性，反而多了会适得其反噢！</p>
     *
     *   文字来源于：https://blog.csdn.net/appleyk
     */
}
