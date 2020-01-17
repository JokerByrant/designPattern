package com.sxh.newfolder.DP17_责任链模式.DP_17.handler;

import com.sxh.newfolder.DP17_责任链模式.DP_17.model.Programmer;

/**
 * 项目经理，审批2000以内的花费
 * @author sxh
 * @date 2020/1/17
 */
public class Director extends Leader {
    public Director() {
        super(2000);
        this.setLeader(new Manager());
    }

    @Override
    public void reply(Programmer programmer) {
        System.out.println(programmer.getApply());
        System.out.println("具体是: " + programmer.getExpense());
        System.out.println("Director: Of course Yes!");
    }
}
