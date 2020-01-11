package com.sxh.newfolder.DP17_责任链模式.demo;

/**
 * @author sxh
 * @date 2020/1/11
 */
public class ThirdLogger extends AbstractLogger {
    public ThirdLogger() {
        this.level = THIRD;
    }

    @Override
    public void write(String message) {
        System.out.println("Third");
    }
}
