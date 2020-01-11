package com.sxh.newfolder.DP17_责任链模式.demo;

/**
 * 抽象过滤器
 * @author sxh
 * @date 2020/1/11
 */
public abstract class AbstractLogger {
    public static int FIRST = 1;
    public static int SECOND = 2;
    public static int THIRD = 3;

    public int level; // 过滤器优先级顺序

    private AbstractLogger nextLogger; // 责任链中的下一个元素

    public void setNextLogget(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract public void write(String message);
}
