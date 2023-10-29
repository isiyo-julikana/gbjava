package OOP.sem2;

import java.util.Random;

public class Main {
    private static int ranNum() {
        int a = 10;
        int b = 30;
        int rand = a + (int) (Math.random() * b);
        return rand;

    }

    public static void main(String[] args) {
        Cat[] arrCats = new Cat[5];
        arrCats[0] = new Cat("Барсик", ranNum());
        arrCats[1] = new Cat("Гав", ranNum());
        arrCats[2] = new Cat("Лора", ranNum());
        arrCats[3] = new Cat("Персик", ranNum());
        arrCats[4] = new Cat("Шарлотта", ranNum());
        Plate plate = new Plate(100);
        plate.info();
        for (Cat cat : arrCats) {
            cat.eat(plate);
            cat.info();
        }
        plate.info();
        plate.addFood(100);
        plate.info();
    }
}
