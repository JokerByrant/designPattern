package com.sxh.newfolder.DP11_外观模式;

import com.sxh.newfolder.DP11_外观模式.DP_11.FacadeAB;
import com.sxh.newfolder.DP11_外观模式.DP_11.ModuleA.FacadeA;
import com.sxh.newfolder.DP11_外观模式.DP_11.ModuleA.SubSystemA;
import com.sxh.newfolder.DP11_外观模式.DP_11.ModuleA.SubSystemB;
import com.sxh.newfolder.DP11_外观模式.DP_11.ModuleB.FacadeB;
import com.sxh.newfolder.DP11_外观模式.DP_11.ModuleB.SubSystemC;
import com.sxh.newfolder.DP11_外观模式.DP_11.ModuleB.SubSystemD;

/**
 * 外观模式测试类
 * @author sxh
 * @date 2019/12/27
 */
public class FacadeTest {
    public static void main(String[] args) {
        /**
         * 不使用外观模式，直接使用智能人工系统的模块A和模块B的功能
         * 缺点：用户必须清楚模块中的各个子系统的工作流程，否则会导致系统的不正常工作
         */
        useModuleA();
        useModuleB();

        /**
         * 使用外观模式A和外观模式B
         * 缺点：依然不够简洁
         */
        userFacadeA();
        useFacadeB();

        /**
         * 使用外观模式AB
         * 优点：用户使用系统，相当的便捷，没有多余的废话
         */
        useFacadeAB();

        /**
         * 通过以上的对比，想必大家已经知道了什么时候该用外观模式，什么时候直接调用子模块
         * 另外插一句：装饰模式、代理模式以及刚刚才学到的外观模式，其模板就是参照的对象适配器来着的
         * 因此，你会有种似曾相识的感觉
         * 设计模式不是一天两天就能悟的透的，它是一个长期而漫长的过程
         * 一旦你领悟到其中的门道，开发项目+写代码将会是一门艺术
         * @from https://blog.csdn.net/appleyk
         */

        /**
         * 外观模式很好的发挥了“单一职责原则”，各个子功能之间没有相互的耦合关系，只需要关注自己需要实现的功能即可。
         * 通过一个外观对象将这些子功能聚合起来，并将自己暴露给客户端，客户端只需要跟外观对象打交道，不需要关注各个具体的子功能实现细节，实现了系统与客户端的解耦。
         * 注意：1.不要试图通过外观类为子系统增加新的行为 ===> 外观模式的用意是为子系统提供一个简化的沟通渠道，而不是向子系统增加新的行为，新的功能应该通过修改原有的子系统或者增加信息的子系统来实现。
         *      2.系统可以有多个外观类 ====> 每个外观类负责与一些特定的子系统进行交互(可以是具有相同特性的)
         * 适用情况：1.要为一个复杂子系统提供一个简单接口；
         *          2.客户程序与多个子系统之间存在很大的依赖性；
         *          3.在层次化结构中，需要定义系统中每一层的入口，使得层与层之间不直接产生联系。
         * 参考：https://design-patterns.readthedocs.io/zh_CN/latest/structural_patterns/facade.html
         */
    }

    /**
     * 不使用外观模式，直接使用模块A的功能
     */
    public static void useModuleA() {
        partition("直接使用模块A中的功能");
        SubSystemA subSystemA = new SubSystemA();
        SubSystemB subSystemB = new SubSystemB();
        subSystemA.initSystem();
        subSystemB.loadDatas();
    }

    /**
     * 不使用外观模式，直接使用模块B的功能
     */
    public static void useModuleB() {
        partition("直接使用模块B中的功能");
        SubSystemC subSystemC = new SubSystemC();
        SubSystemD subSystemD = new SubSystemD();
        subSystemC.sayHello();
        subSystemD.working();
    }

    /**
     * 使用外观模式A，对模块A中的功能进行屏蔽
     */
    public static void userFacadeA() {
        partition("使用外观模式A");
        FacadeA facadeA = new FacadeA();
        facadeA.initialize();
    }

    /**
     * 使用外观模式B，对模块B中的功能进行屏蔽
     */
    public static void useFacadeB() {
        partition("使用外观模式B");
        FacadeB facadeB = new FacadeB();
        facadeB.work();
    }

    /**
     * 使用外观模式AB，对外观模式A和B再进行一次"屏蔽"
     */
    public static void useFacadeAB() {
        partition("使用外观模式AB");
        FacadeAB facadeAB = new FacadeAB();
        facadeAB.startSystem();
    }

    private static  void partition(String note){
        System.out.println("============== 分割线【"+note+"】 ==============");
    }

}
