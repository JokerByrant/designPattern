package com.sxh.newfolder.DP17_责任链模式.demo;

/**
 * @author sxh
 * @date 2020/1/11
 */
public class SecondLogger extends AbstractLogger {
    public SecondLogger() {
        this.level = SECOND;
        this.setNextLogget(new ThirdLogger());
    }

    @Override
    public void write(String message) {
        System.out.println("Second");
    }
}
