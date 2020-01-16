package com.sxh.newfolder.DP17_责任链模式.DP_17.model;

/**
 * @author sxh
 * @date 2020/1/16
 */
public class NullException extends BaseException {
    public NullException() {
        this.code = 500;
        this.message = "空指针异常";
    }
}
