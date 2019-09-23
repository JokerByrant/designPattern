package factory;

/**
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class DogFarm implements AnimalFarm {
    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
