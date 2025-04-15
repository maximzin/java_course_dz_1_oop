package com.zinoviev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cat ash = new Cat("Ash");
        Dog lev = new Dog("Lev");
        Cat yasya = new Cat("Yasya");

        Animal[] animals = {ash, lev, yasya};

        for (Animal animal : animals) {
            System.out.println(animal.getInfo());
            animal.move("run", 400);
            animal.move("swim", 10);
            System.out.println();
        }

        System.out.println(Animal.getAnimalCount());
        System.out.println(Cat.getCatCount());

    }
}