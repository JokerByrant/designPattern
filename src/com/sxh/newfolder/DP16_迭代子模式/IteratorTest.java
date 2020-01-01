package com.sxh.newfolder.DP16_迭代子模式;

import com.sxh.newfolder.DP16_迭代子模式.DP_16.AbstractCollection;
import com.sxh.newfolder.DP16_迭代子模式.DP_16.IIterator;
import com.sxh.newfolder.DP16_迭代子模式.DP_16.MyCollection;

/**
 * 迭代器模式测试
 * @author 一池春水倾半城
 * @date 2020/1/1 13:45
 */
public class IteratorTest {
    public static void main(String[] args) {
        AbstractCollection<Integer> collection1 = new MyCollection<>();
        Integer[] arr = new Integer[]{1,2,3,4};
        collection1.setObjArr(arr);
        IIterator<Integer> iterator = collection1.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("===========若想要迭代器继续迭代输出元素");
        System.out.println("first = " + iterator.first());
        System.out.println("===========我们可以调用first方法重置pos");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=======================再创建一个迭代器");
        IIterator iterator1 = collection1.createIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("==========================创建一个String类型的集合");
        AbstractCollection<String> collection2 = new MyCollection<>();
        String[] strArr = new String[]{"jerry","mike","tom"};
        collection2.setObjArr(strArr);
        IIterator iterator2 = collection2.createIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        /**
         * <p>资料如此描述迭代子模式：</p>
         * 迭代子模式又叫游标模式，是对象的行为模式。
         * 迭代子模式可以顺序的访问一个聚集中的元素而不必暴露聚集内部表象。
         *
         * 什么意思呢，博主来白话一下：
         * （1）这是对对象的操作，因此属于对象的行为操作范畴
         * （2）聚集对象可以进行元素的遍历,既然是遍历，肯定要讲究顺序的（pos++）
         * （3）使用者知道怎么遍历取出元素就行，具体聚合类是怎么实现的，
         *      不告诉你，反正你给我传一个数组就行，我给你创建一个迭代器出来，
         *      具体怎么玩，你拿着我给你创建好的迭代器琢磨去吧！
         *
         *  优点：
         *  （1）本来聚集类要干的事情，分担给具体的迭代器类了，聚集类和迭代器实现了很好的解耦，
         *       这样一来，迭代的算法可以完全独立于聚集类；
         *  （2）一个聚集类的对象，也就是聚集对象，可以创建出N个迭代器，同时进行元素迭代而互不干扰
         *
         * @from: https://blog.csdn.net/appleyk
         */

    }
}
