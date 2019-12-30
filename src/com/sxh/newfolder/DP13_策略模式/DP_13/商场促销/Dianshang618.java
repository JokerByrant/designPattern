package com.sxh.newfolder.DP13_策略模式.DP_13.商场促销;

/**
 * 618 --- 每满300-30
 * @author sxh
 * @date 2019/12/30
 */
public class Dianshang618 implements ICalculatePrice {
    @Override
    public double getDiscountPrice(double totalPrice) {
        int discountPrice = (int) (totalPrice / 300) * 30;
        return totalPrice - discountPrice;
    }
}
