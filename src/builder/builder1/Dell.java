package builder.builder1;

/**
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class Dell extends ComputerBuilder{
    @Override
    void buildCpu() {
        computer.setCpu("i5-8500u");
    }

    @Override
    void buildGraphicsCard() {
        computer.setGraphicsCard("gtx-1080ti");
    }

    @Override
    void buildSoundCard() {
        computer.setSoundCard("normal");
    }

    @Override
    void buildHardDisk() {
        computer.setHardDisk("500M");
    }

    @Override
    void buildMemoryBar() {
        computer.setMemoryBar("8g");
    }

    @Override
    void buildPower() {
        computer.setPower("15W");
    }
}
