package com.sxh.newfolder.DP17_责任链模式.DP_17.handler;

import com.sxh.newfolder.DP17_责任链模式.DP_17.model.Programmer;

/**
 * 老板，审批10000以内的花费
 * @author sxh
 * @date 2020/1/17
 */
public class Boss extends Leader {
    public Boss() {
        super(10000);
    }

    @Override
    public void reply(Programmer programmer) {
        System.out.println(programmer.getApply());
        System.out.println("具体是: " + programmer.getExpense());
        System.out.println("Boss: Of course Yes!");
    }
}
