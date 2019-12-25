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

    /**
     * @param proxy 指代我们所代理的那个真实对象
     * @param method 指代的是我们所要调用真实对象的某个方法的Method对象
     * @param args 指代的是调用真实对象某个方法时接受的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是UU跑腿的工作人员，我去超市帮助客户取商品：" + args[0]);
        // args:参数  targetObj:目标类
        // 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object invoke = method.invoke(targetObj, args);
        System.out.println("拿到被代理对象调用的方法名：" + method.getName() + ",方法参数个数：" + method.getParameterCount());
        System.out.println("商品已成功转交给被代理的对象，期待对象好评");
        return invoke;
    }
}
