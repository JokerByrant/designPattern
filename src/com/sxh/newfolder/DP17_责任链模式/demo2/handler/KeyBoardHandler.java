package com.sxh.newfolder.DP17_责任链模式.demo2.handler;

import com.sxh.newfolder.DP17_责任链模式.demo2.filter.ComputerFilter;
import com.sxh.newfolder.DP17_责任链模式.demo2.model.Computer;
import com.sxh.newfolder.DP17_责任链模式.demo2.model.KeyBoard;

import java.util.List;

/**
 * @author sxh
 * @date 2020/1/20
 */
public class KeyBoardHandler extends AbstractHandler<List<Computer>, ComputerFilter>{
    @Override
    public List<Computer> filter(ComputerFilter filter) {
        List<Computer> computers = this.gettData();
        if (filter.getLoadKeyBoard()) {
            for (Computer computer:computers) {
                KeyBoard keyBoard = new KeyBoard("雷柏");
                computer.setKeyBoard(keyBoard);
            }
        }
        return computers;
    }
}
