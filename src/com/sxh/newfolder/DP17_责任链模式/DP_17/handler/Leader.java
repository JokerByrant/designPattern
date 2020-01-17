package com.sxh.newfolder.DP17_责任链模式.DP_17.handler;

import com.sxh.newfolder.DP17_责任链模式.DP_17.model.Programmer;

/**
 * 抽象领导人
 * @author sxh
 * @date 2020/1/17
 */
public abstract class Leader {
    private int expense; // 当前能审批的金额
    private Leader superiorLeader; // 上级领导

    public Leader(int expense) {
        this.expense = expense;
    }

    /**
     * 回复请求补助的程序员
     * @param programmer
     */
    public abstract void reply(Programmer programmer);

    public void setLeader(Leader leader) {
        this.superiorLeader = leader;
    }

    /**
     * 处理审批请求
     * @param programmer
     */
    public void handlerRequest(Programmer programmer) {
        if (programmer.getExpense() <= expense) { // 如果花费的金额在当前领导的审批范围内
            reply(programmer);
        } else {
            if (this.superiorLeader != null) { // 否则把花费单给上级处理
                this.superiorLeader.handlerRequest(programmer);
            } else {
                System.out.println("Goodbye my Money... " + this.expense);
            }
        }
    }
}
