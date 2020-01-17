package com.sxh.newfolder.DP17_责任链模式.DP_17.handler;

import com.sxh.newfolder.DP17_责任链模式.DP_17.model.Programmer;

/**
 * 部门经理，审批5000以内的花费
 * @author sxh
 * @date 2020/1/17
 */
public class Manager extends Leader {
    public Manager() {
        super(5000);
        this.setLeader(new Boss());
    }

    @Override
    public void reply(Programmer programmer) {
        System.out.println(programmer.getApply());
        System.out.println("具体是: " + programmer.getExpense());
        System.out.println("Manager: Of course Yes!");
    }
}
