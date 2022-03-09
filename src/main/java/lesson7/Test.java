package lesson7;

public class Test {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 25), new Cat("Matroskin", 10), new Cat("Murzik", 5)};
        Plate plate = new Plate(30);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.addFood(50);
        plate.info();
    }
}





