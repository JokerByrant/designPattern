package com.sxh.newfolder.DP16_迭代子模式.DP_16;

/**
 * 迭代器接口
 * @author 一池春水倾半城
 * @date 2020/1/1 13:45
 */
public interface IIterator<T> {
    // 当前迭代器中是否还有元素
    boolean hasNext();

    // 当前迭代器的下一个元素
    T next();

    // 将迭代器的下标重置
    T first();
}
