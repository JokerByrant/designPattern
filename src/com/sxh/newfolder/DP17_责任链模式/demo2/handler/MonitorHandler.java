package com.sxh.newfolder.DP17_责任链模式.demo2.handler;

import com.sxh.newfolder.DP17_责任链模式.demo2.filter.ComputerFilter;
import com.sxh.newfolder.DP17_责任链模式.demo2.model.Computer;
import com.sxh.newfolder.DP17_责任链模式.demo2.model.Monitor;
import com.sxh.newfolder.DP17_责任链模式.demo2.model.Mouse;

import java.util.List;

/**
 * @author sxh
 * @date 2020/1/20
 */
public class MonitorHandler extends AbstractHandler<List<Computer>, ComputerFilter> {
    @Override
    public List<Computer> filter(ComputerFilter filter) {
        List<Computer> computers = this.gettData();
        if (filter.getLoadMouse()) {
            for (Computer computer:computers) {
                Monitor monitor = new Monitor(27);
                computer.setMonitor(monitor);
            }
        }
        return computers;
    }
}
