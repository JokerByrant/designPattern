package com.sxh.newfolder.DP17_责任链模式.demo2.filter;

/**
 * @author sxh
 * @date 2020/1/20
 */
public class ComputerFilter extends AbstractFilter {
    // 是否组装显示器
    private Boolean loadMonitor = false;

    // 是否组装键盘
    private Boolean loadKeyBoard = false;

    // 是否组装鼠标
    private Boolean loadMouse = false;

    public Boolean getLoadMonitor() {
        return loadMonitor;
    }

    public void setLoadMonitor(Boolean loadMonitor) {
        this.loadMonitor = loadMonitor;
    }

    public Boolean getLoadKeyBoard() {
        return loadKeyBoard;
    }

    public void setLoadKeyBoard(Boolean loadKeyBoard) {
        this.loadKeyBoard = loadKeyBoard;
    }

    public Boolean getLoadMouse() {
        return loadMouse;
    }

    public void setLoadMouse(Boolean loadMouse) {
        this.loadMouse = loadMouse;
    }
}
