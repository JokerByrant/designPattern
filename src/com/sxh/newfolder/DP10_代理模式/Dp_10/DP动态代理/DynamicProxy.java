package com.sxh.newfolder.DP10_代理模式.Dp_10.DP动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类 == 程序运行时，代理类才知道被代理的对象是哪个
 * @author 一池春水倾半城
 * @date 2019/12/17 22:32
 */
public class DynamicProxy implements InvocationHandler {
    /**
     * 被代理的目标对象
     */
    private Object targetObj;

    /**
     * 暂时不知道被代理的对象是人还是动物或是其它...etc
     */
    public DynamicProxy(Object targetObj) {
        this.targetObj = targetObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是UU跑腿的工作人员，我去超市帮助客户取商品：" + args[0]);
        // args:参数  targetObj:目标类
        // 在这里调用了
        Object invoke = method.invoke(targetObj, args);
        System.out.println("拿到被代理对象调用的方法名：" + method.getName() + ",方法参数个数：" + method.getParameterCount());
        System.out.println("商品已成功转交给被代理的对象，期待对象好评");
        return invoke;
    }
}
