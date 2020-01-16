package com.sxh.newfolder.DP17_责任链模式.DP_17.model;

/**
 * @author sxh
 * @date 2020/1/16
 */
public class NotFoundException extends BaseException{
    public NotFoundException() {
        this.code = 404;
        this.message = "找不到指定资源!";
        this.nextException = new NullException();
    }
}
