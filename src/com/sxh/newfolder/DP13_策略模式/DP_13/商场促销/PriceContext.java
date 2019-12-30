package com.sxh.newfolder.DP13_策略模式.DP_13.商场促销;

/**
 * 计算折后价格的统一入口，由用户指定具体的打折策略
 * @author sxh
 * @date 2019/12/30
 */
public class PriceContext {
    private ICalculatePrice calculatePrice;

    public PriceContext(ICalculatePrice calculatePrice) {
        this.calculatePrice = calculatePrice;
    }

    public double discount(double totalPrice) {
        return calculatePrice.getDiscountPrice(totalPrice);
    }
}
