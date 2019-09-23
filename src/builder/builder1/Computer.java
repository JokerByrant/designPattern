package builder.builder1;

/**
 * 电脑类
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class Computer {
    // CPU
    private String cpu;
    // 显卡
    private String graphicsCard;
    // 声卡
    private String soundCard;
    // 硬盘
    private String hardDisk;
    // 内存
    private String memoryBar;
    // 电源
    private String power;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(String soundCard) {
        this.soundCard = soundCard;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getMemoryBar() {
        return memoryBar;
    }

    public void setMemoryBar(String memoryBar) {
        this.memoryBar = memoryBar;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", soundCard='" + soundCard + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", memoryBar='" + memoryBar + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
