package OOP.sem4.homework;

public class Apple extends Fruit {

    public Apple() {
        super(1.0f);

    }

    @Override
    public String toString() {
        return "Вес яблока : " + this.getWeight();
    }

}
