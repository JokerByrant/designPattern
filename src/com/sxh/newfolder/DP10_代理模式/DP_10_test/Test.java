package com.sxh.newfolder.DP10_代理模式.DP_10_test;

import com.sxh.newfolder.DP10_代理模式.DP_10_test.DE装饰模式.Bird4;
import com.sxh.newfolder.DP10_代理模式.DP_10_test.DE装饰模式.Bird5;
import com.sxh.newfolder.DP10_代理模式.DP_10_test.DP动态代理.BirdDynamicProxy;
import com.sxh.newfolder.DP10_代理模式.DP_10_test.EX继承.Bird2;
import com.sxh.newfolder.DP10_代理模式.DP_10_test.SP静态代理.Bird3;
import com.sxh.newfolder.DP10_代理模式.DP_10_test.service.Flyable;
import com.sxh.newfolder.DP10_代理模式.DP_10_test.service.impl.Bird;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 一池春水倾半城
 * @date 2019/12/18 23:02
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 现在有一只飞行的鸟，飞行时间不确定，我想要计算这只鸟的飞行时间，有以下几种方案。
         */

        // 1.使用继承
        Bird2 bird2 = new Bird2();
        bird2.fly();

        System.out.println("=======================================");

        // 2.使用静态代理
        Bird3 bird3 = new Bird3();
        bird3.fly();

        System.out.println("=======================================");

        // 3.使用装饰者模式，顺便打印日志
        Flyable birdTime = new Bird4(new Bird());
        Flyable birdLog = new Bird5(birdTime);
        birdLog.fly();
        System.out.println("-.-.-.-.-.-.-.-.更换日志和计算时间输出的位置.-.-.-.-.-.-.-.-.-.-");
        Flyable birdLog1 = new Bird5(new Bird());
        Flyable birdTime1 = new Bird4(birdLog1);
        birdTime1.fly();

        System.out.println("=======================================");

        // 4.使用动态代理模式
        // 要代理哪个对象，就传哪个对象进去，最后调用方法时就是通过传入的这个真实对象调用的
        InvocationHandler handler = new BirdDynamicProxy(bird3);
        /**
         * bird3.getClass().getClassLoader() ===> 拿到类加载器
         * bird3.getClass().getInterfaces() ===> 拿到bird3对象所实现的接口，表示我要代理的是这个接口下的一个实现类，这样就能调用接口下的方法了
         * handler ===> 将这个代理对象关联到上面创建的InvocationHandler 这个对象上，调用方法时由该对象设置的具体对象(bird3)调用
         */
        Flyable dynamicBird = (Flyable)Proxy.newProxyInstance(bird3.getClass().getClassLoader(), bird3.getClass().getInterfaces(), handler);
        /**
         * 这里通过代理对象来调用实现那组接口中的方法，这时候程序会跳转到由这个代理对象关联的handler中的invoke方法去执行，
         * 而当前的handler接收了一个Bird3类型的参数，表示当前代理的就是这个对象，所以在invoke方法中调用的Bird3对应方法fly()
         */
        dynamicBird.fly();
        /**
         * 通过 Proxy.newProxyInstance 创建的代理对象是在jvm运行时动态生成的一个对象，它并不是我们的InvocationHandler类型，
         * 也不是我们定义的那组接口的类型，而是在运行是动态生成的一个对象，并且命名方式都是这样的形式，以$开头，proxy为中，最后一个数字表示对象的标号。
         * 下面的打印结果：class com.sun.proxy.$Proxy0
         */
        System.out.println(dynamicBird.getClass());

    }
}
