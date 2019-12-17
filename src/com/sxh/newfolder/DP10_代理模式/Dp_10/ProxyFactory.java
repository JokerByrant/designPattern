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

    public static Object getDynProxy(Object target) {
        InvocationHandler handler = new DynamicProxy(target);
        // 拿到代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
    }
}
