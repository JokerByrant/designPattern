package com.sxh.history.factory;

/**
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class Main {
    public static void main(String[] args) {
        AnimalFarm dogFarm = new DogFarm();
        AnimalFarm catFarm = new CatFarm();

        Animal dog = dogFarm.getAnimal();
        Animal cat = catFarm.getAnimal();

        dog.show();
        cat.show();
    }
}
