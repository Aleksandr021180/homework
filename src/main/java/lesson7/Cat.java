package lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    void info() {
        String isSatiety = !satiety ? "сыт" : "голоден";
        System.out.println(name + ": " + isSatiety);
    }

    void eat(Plate plate) {
        if (satiety && plate.decreaseFood(appetite))
            satiety = false;
    }
}
