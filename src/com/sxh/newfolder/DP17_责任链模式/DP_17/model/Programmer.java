package com.sxh.newfolder.DP17_责任链模式.DP_17.model;

/**
 * 抽象程序员类
 * @author sxh
 * @date 2020/1/17
 */
public abstract class Programmer {
    public int expense; // 花费
    public String apply; // 要钱干吗

    public Programmer(int expense, String apply) {
        this.expense = expense;
        this.apply = apply;
    }

    public Programmer() {
    }

    public int getExpense() {
        return this.expense;
    }

    public String getApply() {
        return this.apply;
    }
}
