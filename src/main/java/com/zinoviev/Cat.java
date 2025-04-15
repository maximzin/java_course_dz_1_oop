package com.zinoviev;

public class Cat extends Animal {

    private static int catCount;
    public static int getCatCount() {
        return catCount;
    }

    public Cat(String name) {
        super(name, "cat", 200, 0);
        catCount++;
    }
}
