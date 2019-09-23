package builder.builder1;

/**
 * 联想电脑
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class Lenovo extends ComputerBuilder {
    @Override
    void buildCpu() {
        computer.setCpu("i7-6900k");
    }

    @Override
    void buildGraphicsCard() {
        computer.setGraphicsCard("gtx-2080ti");
    }

    @Override
    void buildSoundCard() {
        computer.setSoundCard("normal");
    }

    @Override
    void buildHardDisk() {
        computer.setHardDisk("1TB");
    }

    @Override
    void buildMemoryBar() {
        computer.setMemoryBar("16g");
    }

    @Override
    void buildPower() {
        computer.setPower("20W");
    }
}
