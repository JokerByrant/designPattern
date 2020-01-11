package com.sxh.newfolder.DP17_责任链模式.demo;

/**
 * @author sxh
 * @date 2020/1/11
 */
public class Test {
    public static void main(String[] args) {
        AbstractLogger logger = new FristLogger();

        logger.logMessage(AbstractLogger.FIRST, "");
        System.out.println("==================分隔线===================");
        logger.logMessage(AbstractLogger.SECOND, "");
        System.out.println("==================分隔线===================");
        logger.logMessage(AbstractLogger.THIRD, "");
    }

    /**
     * 通过这个Demo发现，责任链模式就是将处理类组合成一个链状结构，客户直接将请求发送到这个职责链上，至于请求如何处理和请求的传递过程则无需关心。
     * Netty中的handler应该就是使用了这种模式
     */
}
