package com.sxh.newfolder.DP16_迭代子模式.DP_16;

/**
 * 抽象集合类
 * @author 一池春水倾半城
 * @date 2020/1/1 13:48
 */
public abstract class AbstractCollection<T> {
    // 集合的底层是数组
    T[] arr;

    public AbstractCollection(T[] arr) {
        this.arr = arr;
    }

    public AbstractCollection() {
    }

    // 创建迭代器
    public abstract IIterator createIterator();

    // 获取当前集合的大小
    public abstract int size();

    // 判空
    public abstract boolean isEmpty();

    public T[] getObjArr() {
        return this.arr;
    }

    public void setObjArr(T[] objArr) {
        this.arr = objArr;
    }
}
