package com.sxh.newfolder.DP17_责任链模式;

import com.sxh.newfolder.DP17_责任链模式.DP_17.handler.GroupLeader;
import com.sxh.newfolder.DP17_责任链模式.DP_17.handler.Leader;
import com.sxh.newfolder.DP17_责任链模式.DP_17.model.Javaer;
import com.sxh.newfolder.DP17_责任链模式.DP_17.model.Programmer;

/**
 * @author sxh
 * @date 2020/1/17
 */
public class HandlerTest {
    public static void main(String[] args) {
        programmerTravel();
    }

    /**
     * 程序员出差
     */
    private static void programmerTravel() {
        Programmer javaer = new Javaer((int) (Math.random() * 20000), "爹要点钱出差");
        Leader groupLeader = new GroupLeader();

        groupLeader.handlerRequest(javaer);
    }
}
