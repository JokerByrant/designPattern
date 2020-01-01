package com.sxh.newfolder.DP16_迭代子模式.DP_16;

import java.util.Collection;

/**
 * @author 一池春水倾半城
 * @date 2020/1/1 13:52
 */
public class MyIterator implements IIterator {
    /**
     * 迭代器的目标对象
     */
    private AbstractCollection collection;

    /**
     * 下标，记录当前读取位置
     */
    private int pos;

    /**
     * 记录集合的大小
     */
    private int size;

    public MyIterator(AbstractCollection collection) {
        this.collection = collection;
        this.size = collection.size();
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        if (pos < size) {
            pos++;
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return collection.getObjArr()[pos - 1];
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.getObjArr()[pos];
    }
}
