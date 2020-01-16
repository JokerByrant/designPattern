package com.sxh.newfolder.DP17_责任链模式.DP_17.model;

/**
 * 抽象基础异常类
 * @author sxh
 * @date 2020/1/16
 */
public abstract class BaseException {
    //错误码
    public int code;

    //错误信息
    public String message;

    //是否处理完成
    public Boolean isSolved = false;

    public BaseException nextException;

    //处理方法
    public void handle() {
        System.out.println("错误代码：" + this.code + "，错误信息：" + this.message);
        this.isSolved = true;
    }

    public void filter() {
        handle();
        if (!isSolved && nextException != null) {
            nextException.filter();
        }
    }
}
