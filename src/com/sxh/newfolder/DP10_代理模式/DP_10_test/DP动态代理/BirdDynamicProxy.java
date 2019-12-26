package com.sxh.newfolder.DP10_代理模式.DP_10_test.DP动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 一池春水倾半城
 * @date 2019/12/25 23:30
 */
public class BirdDynamicProxy implements InvocationHandler {
    Object object;

    public BirdDynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("===============start==================");
        // 调用object类对应的方法，具体方法由用户控制
        Object invoke = method.invoke(object, args);
        System.out.println("===============end==================");

        return invoke;
    }

    /**
     * 封装newProxyInstance
     * @param target
     * @return
     */
    public Object getProxy(Object target) {
        Class clazz = object.getClass();
        ClassLoader classLoader = clazz.getClassLoader();
        Class[] interfaces = clazz.getInterfaces();

        return Proxy.newProxyInstance(classLoader, interfaces, this);
    }
}
