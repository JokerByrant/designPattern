package com.sxh.newfolder.DP2_抽象工厂.DP2_test.logProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 套餐的代理类 ===> 打印出餐日志
 * @author 一池春水倾半城
 * @date 2019/12/28 13:17
 */
public class PackageProxy implements InvocationHandler {
    private Object object;

    public PackageProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("请耐心等待，正在出餐中....");
        Object invoke = method.invoke(object, args);
        return invoke;
    }

    public Object getProxy() {
        Class clazz = object.getClass();
        ClassLoader classLoader = clazz.getClassLoader();
        Class[] interfaces = clazz.getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, this);
    }
}
