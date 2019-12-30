package com.sxh.newfolder.DP13_策略模式.DP_13.商场促销;

/**
 * 定义价格计算策略接口
 * @author sxh
 * @date 2019/12/30
 */
public interface ICalculatePrice {
    /**
     * 计算折扣后的价格
     * @param totalPrice
     * @return
     */
    public double getDiscountPrice(double totalPrice);
}
