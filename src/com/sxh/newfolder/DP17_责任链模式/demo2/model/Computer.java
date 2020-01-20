package com.sxh.newfolder.DP17_责任链模式.demo2.model;

/**
 * @author sxh
 * @date 2020/1/20
 */
public class Computer {
    // 品牌
    private String brand;

    // 价格
    private Double price;

    // 显示器
    private Monitor monitor;

    // 键盘
    private KeyBoard keyBoard;

    // 鼠标
    private Mouse mouse;

    public Computer(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", monitor=" + monitor +
                ", keyBoard=" + keyBoard +
                ", mouse=" + mouse +
                '}';
    }
}
