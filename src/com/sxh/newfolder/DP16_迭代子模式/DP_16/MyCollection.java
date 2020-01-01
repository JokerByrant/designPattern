package com.sxh.newfolder.DP16_迭代子模式.DP_16;

import java.util.Collection;

/**
 * @author 一池春水倾半城
 * @date 2020/1/1 13:51
 */
public class MyCollection<T> extends AbstractCollection {

    public MyCollection(T[] arr) {
        super(arr);
    }

    public MyCollection() {
    }

    @Override
    public IIterator createIterator() {
        /**
         * 将当前集合对象作为参数，调用迭代器的构造函数
         * 注意，该方法的NB之处，就是同一个聚集对象可以new出来好多个迭代器
         * 虽然，上面一段话说出来跟没说一样，但是博主还是想傻傻的强调一下
         */
        return new MyIterator(this);
    }

    @Override
    public int size() {
        if (arr == null) {
            throw new NullPointerException("arr is Null!");
        }
        return arr.length;
    }

    @Override
    public boolean isEmpty() {
        if (arr == null) {
            throw new NullPointerException("arr is Null!");
        }
        return arr.length == 0;
    }
}
