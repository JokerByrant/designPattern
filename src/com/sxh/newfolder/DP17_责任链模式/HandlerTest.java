package com.sxh.newfolder.DP17_责任链模式;

import com.sxh.newfolder.DP17_责任链模式.DP_17.model.NullException;

/**
 * @author sxh
 * @date 2020/1/16
 */
public class HandlerTest {
    public static void main(String[] args) {
        NullException exception = new NullException();
        exception.filter();
    }
}
