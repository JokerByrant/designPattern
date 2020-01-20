package com.sxh.newfolder.DP17_责任链模式.demo2.handler;

import com.sxh.newfolder.DP17_责任链模式.demo2.filter.ComputerFilter;
import com.sxh.newfolder.DP17_责任链模式.demo2.model.Computer;
import com.sxh.newfolder.DP17_责任链模式.demo2.model.Mouse;

import java.util.List;

/**
 * @author sxh
 * @date 2020/1/20
 */
public class MouseHandler extends AbstractHandler<List<Computer>, ComputerFilter> {
    @Override
    public List<Computer> filter(ComputerFilter filter) {
        List<Computer> computers = this.gettData();
        if (filter.getLoadMouse()) {
            for (Computer computer:computers) {
                Mouse mouse = new Mouse("罗技");
                computer.setMouse(mouse);
            }
        }
        return computers;
    }
}
