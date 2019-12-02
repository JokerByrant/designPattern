package com.sxh.history.protoType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType r1 = new RealizeType("zhangsan");
        // clone方法相当于创建了一个新对象r2，并且这个对象r2的地址和r1并不相同
        RealizeType r2 = r1.clone();
        // false
        System.out.println(r2 == r1);

        // 这里并没有创建新的对象，r3指向的地址就是r1所指向的地址
        RealizeType r3 = r1;
        // true
        System.out.println(r3 == r1);

        List<RealizeType> realizeTypes = new ArrayList<>();
        realizeTypes.add(r1);

        // 因此，这里修改r3的值，等于是修改了r3指向的地址的值，r1也会相应的被改变，对应的list中元素的值也会改变。
        r3.setName("lisi");
        // r1 = RealizeType{name='lisi'}
        System.out.println("r1 = " + r1);
        // [RealizeType{name='lisi'}]
        System.out.println(realizeTypes);
    }
}
