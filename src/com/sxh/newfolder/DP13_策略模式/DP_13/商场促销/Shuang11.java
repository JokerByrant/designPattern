package com.sxh.newfolder.DP13_策略模式.DP_13.商场促销;

/**
 * 天猫双十一狂欢节 --- 满500减150，满1000减400
 * @author sxh
 * @date 2019/12/30
 */
public class Shuang11 implements ICalculatePrice {
    @Override
    public double getDiscountPrice(double totalPrice) {
        if (totalPrice >= 500 && totalPrice < 1000) {
            return totalPrice - 150;
        } else if (totalPrice >= 1000) {
            return totalPrice - 400;
        }
        return 0;
    }
}
