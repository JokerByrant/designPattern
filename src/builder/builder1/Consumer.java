package builder.builder1;

/**
 * 消费者，拿到电脑
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class Consumer {
    public static void main(String[] args) {
        // 客户想要一天联想电脑
        ComputerBuilder lenovo = new Lenovo();
        Company company = new Company(lenovo);
        Computer computer = company.construct();
        System.out.println(computer);

        // 客户想要一台戴尔电脑
        ComputerBuilder dell = new Dell();
        Company company1 = new Company(dell);
        Computer computer1 = company1.construct();
        System.out.println(computer1);
    }
}
