package com.sxh.newfolder.DP17_责任链模式.demo2.handler;

import com.sxh.newfolder.DP17_责任链模式.demo2.filter.ComputerFilter;
import com.sxh.newfolder.DP17_责任链模式.demo2.model.Computer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author sxh
 * @date 2020/1/20
 */
public class ComputerHandler extends AbstractHandler<List<Computer>, ComputerFilter> {
    @Override
    public List<Computer> filter(ComputerFilter filter) {
        List<Computer> computers = new ArrayList<>();
        HashSet<Long> ids = filter.getIds();
        for (Long id:ids) {
            Computer computer = new Computer("Lenovo-" + id, 5000.0);
            computers.add(computer);
        }
        return computers;
    }
}
