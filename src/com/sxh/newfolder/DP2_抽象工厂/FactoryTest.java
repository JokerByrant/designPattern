package com.sxh.newfolder.DP2_抽象工厂;

import com.sxh.newfolder.DP2_抽象工厂.DP2.BuyJacket;
import com.sxh.newfolder.DP2_抽象工厂.DP2.BuyShoes;
import com.sxh.newfolder.DP2_抽象工厂.Factory.Collocation1;
import com.sxh.newfolder.DP2_抽象工厂.Factory.Collocation2;

/**
 * 抽象工厂测试 --- 两位靓仔正在网购，有两个穿搭供他们选择
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class FactoryTest {
    public static void main(String[] args) {
        // 1、第一个靓仔想要试试第一套穿搭，买一件森马的外套和耐克的鞋子
        Collocation1 collocation1 = new Collocation1();
        BuyJacket jacket = collocation1.createJacket();
        BuyShoes shoes = collocation1.createShoes();
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓第一套穿搭↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        jacket.buyJacket(175, "gery");
        shoes.buyShoes(43, "red");

        System.out.println("\n==================手动分割=================\n");

        // 2、第二个靓仔想要试试第二套穿搭，买一件美邦的外套和阿迪的鞋子
        Collocation2 collocation2 = new Collocation2();
        BuyJacket jacket1 = collocation2.createJacket();
        BuyShoes shoes1 = collocation2.createShoes();
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓第二套穿搭↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        jacket1.buyJacket(180, "black");
        shoes1.buyShoes(44, "white");

        /**
         * 缺点：现在清单上只有夹克和鞋子，如果想增加一个裤子，那么就需要修改很多代码
         * 优点：如果清单保持不变，只是想增加一些穿搭的话，那么就很方便，只要再创建一个对应的穿搭工厂即可
         * 总结：1.抽象工厂适合已经给出了一系列的产品，需要将这些产品通过组合分类来适应具体的场景，也就是说抽象工厂主要关注的是产品之间的组合关系。
         *      2.而工厂方法则适合单一产品类的场景。
         *      参考：https://www.zhihu.com/question/20367734
         */
    }
}
