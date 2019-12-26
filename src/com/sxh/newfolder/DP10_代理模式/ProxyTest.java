package com.sxh.newfolder.DP10_代理模式;

import com.sxh.newfolder.DP10_代理模式.Dp_10.NP非代理.UserOwn;
import com.sxh.newfolder.DP10_代理模式.Dp_10.ProxyFactory;
import com.sxh.newfolder.DP10_代理模式.Dp_10.VP_虚拟代理.Secretary;
import com.sxh.newfolder.DP10_代理模式.Dp_10.service.CommodityService;
import com.sxh.newfolder.DP10_代理模式.Dp_10.service.impl.DogImpl;
import com.sxh.newfolder.DP10_代理模式.Dp_10.service.impl.UserImpl;

/**
 * @author 一池春水倾半城
 * @date 2019/12/17 21:32
 */
public class ProxyTest {
    public static void main(String[] args) {
        String dName = "狗粮";
        String uName = "可乐";
        useStaticProxy(uName,dName);
        useDynamicProxy(uName, dName);
        useVirtualProxy(5);

        /**
         * 不使用代理:没有对比就没有伤害，主要和下面使用了代理模式的对象进行比较
         * 静态代理:针对特定对象的访问进行"装饰"，虽和装饰者模式很像，但也只是很像，切记搞混淆
         * 动态代理:区别静态代理，静态代理模式在程序编译时即确定了被代理的对象
         * 		     而动态代理只有在程序运行时才确定要被代理的对象是谁
         *        动态代理主要应用于框架，即反射技术一般用不到，如果用到了，那多半是用于框架级的项目
         *        典型代表：Spring框架 -- AOP【面向切面编程】
         * 虚拟代理:可延缓被代理对象的创建
         *        优点: 程序启动快
         *        缺点: 因为被代理的实例不是在第一时间创建的，因此在使用的时候，
         *             需要狠小心的判断null值，以防止NullPointException
         *        应用：图片的预加载 ===> 先使用一张loading图占位，图片加载完成后填充图片进去
         */
    }

    /**
     * 不使用代理
     * @param uName
     */
    private static void noProxy(String uName) {
        UserOwn userOwn = new UserOwn();
        userOwn.getCommodity(uName);
        System.out.println("=============================");
    }

    /**
     * 使用静态代理
     * @param uName
     * @param dName
     */
    private static void useStaticProxy(String uName, String dName) {
        // 使用静态代理模式，通过UU跑腿服务，狗狗拿到自己的狗粮
        ProxyFactory.getDogProxy().getCommodity(dName);
        System.out.println("==============================");
        // 使用静态代理模式，通过UU跑腿服务，用户拿到自己的商品
        ProxyFactory.getUserProxy().getCommodity(uName);
        System.out.println("==============================");
    }

    /**
     * 使用动态代理
     * @param uName
     * @param dName
     */
    private static void useDynamicProxy(String uName, String dName) {
        // Todo:理解类加载流程
        // 使用动态代理模式，通过UU跑腿服务，用户拿到自己要的薯片
        CommodityService userProxy = (CommodityService) ProxyFactory.getDynProxy(new UserImpl());
        userProxy.getCommodity(uName);
        System.out.println("===============================");

        // 使用动态代理模式，通过UU跑腿服务，宠物狗拿到自己要的狗粮
        CommodityService dogProxy = (CommodityService) ProxyFactory.getDynProxy(new DogImpl());
        dogProxy.getCommodity(dName);
        System.out.println("===============================");
    }


    /**
     * 使用虚拟代理
     * @param second 秒数
     */
    private static void useVirtualProxy(int second) {
        Secretary secretary = new Secretary();
        secretary.addDeal("合同1");
        secretary.addDeal("合同2");

        secretary.initLeader(second);

        secretary.addDeal("合同3");
        secretary.addDeal("合同4");
        secretary.sign();
    }
}
