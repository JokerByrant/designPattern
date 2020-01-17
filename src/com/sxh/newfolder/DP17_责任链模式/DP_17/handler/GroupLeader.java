package com.sxh.newfolder.DP17_责任链模式.DP_17.handler;

import com.sxh.newfolder.DP17_责任链模式.DP_17.model.Programmer;

/**
 * 小组组长，审批1000以内的花费
 * @author sxh
 * @date 2020/1/17
 */
public class GroupLeader extends Leader {
    public GroupLeader() {
        super(1000);
        this.setLeader(new Director());
    }

    @Override
    public void reply(Programmer programmer) {
        System.out.println(programmer.getApply());
        System.out.println("具体是: " + programmer.getExpense());
        System.out.println("GroupLeader: Of course Yes!");
    }
}
