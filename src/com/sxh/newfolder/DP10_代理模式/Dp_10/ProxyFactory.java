package com.sxh.newfolder.DP10_代理模式.Dp_10;

import com.sxh.newfolder.DP10_代理模式.Dp_10.DP动态代理.DynamicProxy;
import com.sxh.newfolder.DP10_代理模式.Dp_10.SP静态代理.DogProxy;
import com.sxh.newfolder.DP10_代理模式.Dp_10.SP静态代理.UserProxy;
import com.sxh.newfolder.DP10_代理模式.Dp_10.service.CommodityService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理工厂
 * @author 一池春水倾半城
 * @date 2019/12/17 22:21
 */
public class ProxyFactory {
    /**
     * 获取一个静态用户代理对象
     * @return
     */
    public static CommodityService getUserProxy() {
        return new UserProxy();
    }

    /**
     * 获取一个静态宠物狗代理对象
     * @return
     */
    public static CommodityService getDogProxy() {
        return new DogProxy();
    }

    /**
     * 获取动态代理对象
     * @param target
     * @return
     */
    public static Object getDynProxy(Object target) {
        InvocationHandler handler = new DynamicProxy(target);
        // 拿到代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
    }

    /**
     * newProxyInstance()方法中的三个对象
     * @param loader 一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
     * @param interfaces 一个interface对象数组，表示我们将要给我们的代理对象提供一组什么样的接口，如果我们提供了这样一个接口对象数组，那么也就是声明了代理类实现了这些接口，代理类就可以调用接口中声明的所有方法。
     * @param h 一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上，并最终由其调用。
     */
}
