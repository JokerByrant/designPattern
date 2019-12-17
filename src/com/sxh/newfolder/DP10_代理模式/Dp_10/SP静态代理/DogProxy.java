package com.sxh.newfolder.DP10_代理模式.Dp_10.SP静态代理;

import com.sxh.newfolder.DP10_代理模式.Dp_10.service.CommodityService;
import com.sxh.newfolder.DP10_代理模式.Dp_10.service.impl.DogImpl;

/**
 * 宠物狗代理类 === 静态代理--->被代理的对象在编译时就知道了
 * @author 一池春水倾半城
 * @date 2019/12/17 22:14
 */
public class DogProxy implements CommodityService {
    // 预先确定好代理与被代理者的关系，被代理的对象是宠物狗
    private DogImpl dog;

    public DogProxy() {
        dog = new DogImpl();
    }

    @Override
    public void getCommodity(String name) {
        System.out.println("我是UU跑腿的工作人员，我去超市帮助狗狗取狗粮：" + name);
        dog.getCommodity(name);
        System.out.println("狗狗拿到货了，如果满意请汪汪两声");
    }

    /**
     * 发现了没有，跟装饰模式很像有木有！看上去都是A先实现了一个接口，然后B再实现这个接口并对A的功能进行拓展！
     * 但它们是有区别的：装饰器模式中的装饰类中拿到的是一个并没有被实例化的对象，具体的实例化对象交给外界控制；
     *                  而本例中被代理的对象的实例在代理的类中就完成了实例化，不对外暴露。
     */
}
