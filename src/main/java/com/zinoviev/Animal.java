package com.zinoviev;

public abstract class Animal {

    private static int animalCount = 0;

    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;

    public Animal(String name, String type, int maxRun, int maxSwim) {
        this.name = name;
        this.type = type;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        animalCount++;
    }

    public Animal() {
    }

    public String getInfo() {
        return name + " is " + type;
    }

    public void move(String moveType, int distance) {
        switch (moveType) {
            case "run":
                if (distance <= maxRun && maxRun != 0) {
                    System.out.println("Running " + name + " to " + moveType + " with distance " + distance);
                } else {
                    System.out.println("CANNOT Run " + name + " to " + moveType + " with distance " + distance);
                }
                break;
            case "swim":
                if (distance <= maxSwim && maxSwim != 0) {
                    System.out.println("Swimming " + name + " to " + moveType + " with distance " + distance);
                } else {
                    System.out.println("CANNOT Swimming " + name + " to " + moveType + " with distance " + distance);
                }
                break;
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
