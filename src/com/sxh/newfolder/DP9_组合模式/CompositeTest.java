package com.sxh.newfolder.DP9_组合模式;

import com.sxh.newfolder.DP9_组合模式.DP_9.TreeNode;

/**
 * 组合模式测试类
 * @author 一池春水倾半城
 * @date 2019/12/17 20:37
 */
public class CompositeTest {
    public static void main(String[] args) {
        // 根节点==>公司
        TreeNode root = new TreeNode("经纬软件公司");

        // 二级节点==>部门
        TreeNode technology = root.addChildNode("技术部");
        TreeNode market = root.addChildNode("市场部");

        // 三级节点==>具体岗位
        technology.addChildNode("Java开发");
        technology.addChildNode("Python开发");
        market.addChildNode("营销");
        market.addChildNode("公关");

        System.out.println(root);

        /**
         * 组合模式，就是在一个对象中包含其他对象，这些被包含的对象可能是终点对象（不再包含别的对象），也有可能是非终点对象（其内部还包含其他对象，或叫组对象）
         * 我们将对象称为节点，即一个根节点包含许多子节点，这些子节点有的不再包含子节点，而有的仍然包含子节点，以此类推。
         *
         * 说白了，组合模式类似递归。它最终呈现出的样式是一个树形的结构，它主要用来“部分-整体”的层次结构。
         *
         * 优点： 1、高层模块调用简单。 2、节点自由增加。
         * 缺点：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
         * 使用场景：部分、整体场景，如树形菜单，文件、文件夹的管理。
         */

    }
}
