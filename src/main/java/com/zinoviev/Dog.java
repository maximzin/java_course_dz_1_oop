package com.zinoviev;

public class Dog extends Animal{

    private static int dogCount;
    public static int getDogCount() {
        return dogCount;
    }

    public Dog(String name) {
        super(name, "dog", 500, 10);
        dogCount++;
    }

}
