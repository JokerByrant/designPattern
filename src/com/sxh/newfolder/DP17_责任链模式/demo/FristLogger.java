package com.sxh.newfolder.DP17_责任链模式.demo;

/**
 * @author sxh
 * @date 2020/1/11
 */
public class FristLogger extends AbstractLogger {
    public FristLogger() {
        this.level = FIRST;
        this.setNextLogget(new SecondLogger());
    }

    @Override
    public void write(String message) {
        System.out.println("First");
    }
}
