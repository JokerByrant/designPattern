package com.sxh.newfolder.DP17_责任链模式;

import com.sxh.newfolder.DP17_责任链模式.DP_17.handler.GroupLeader;
import com.sxh.newfolder.DP17_责任链模式.DP_17.handler.Leader;
import com.sxh.newfolder.DP17_责任链模式.DP_17.model.Javaer;
import com.sxh.newfolder.DP17_责任链模式.DP_17.model.Programmer;
import com.sxh.newfolder.DP17_责任链模式.demo2.filter.ComputerFilter;
import com.sxh.newfolder.DP17_责任链模式.demo2.handler.*;
import com.sxh.newfolder.DP17_责任链模式.demo2.model.Computer;

import java.util.List;

/**
 * @author sxh
 * @date 2020/1/17
 */
public class HandlerTest {
    public static void main(String[] args) {
        programmerTravel();

        System.out.println("\n=======================================\n");

        buyComputer();
    }

    /**
     * 程序员出差
     */
    private static void programmerTravel() {
        Programmer javaer = new Javaer((int) (Math.random() * 20000), "爹要点钱出差");
        Leader groupLeader = new GroupLeader();

        groupLeader.handlerRequest(javaer);
    }

    private static void buyComputer() {
        ComputerFilter filter = new ComputerFilter();
        filter.addIds(1001L);
        filter.addIds(1002L);
        filter.setLoadKeyBoard(true);
        filter.setLoadMonitor(true);
        filter.setLoadMouse(true);

        ComputerHandler computerHandler = new ComputerHandler();
        MonitorHandler monitorHandler = new MonitorHandler();
        MouseHandler mouseHandler = new MouseHandler();
        KeyBoardHandler keyBoardHandler = new KeyBoardHandler();

        computerHandler.setNextHandler(keyBoardHandler);
        keyBoardHandler.setNextHandler(monitorHandler);
        monitorHandler.setNextHandler(mouseHandler);

        List<Computer> computers = (List<Computer>) AbstractHandler.process(computerHandler, filter);
        System.out.println(computers);
    }
}
