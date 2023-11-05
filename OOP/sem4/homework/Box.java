package OOP.sem4.homework;

import java.util.ArrayList;

public class Box<T extends Fruit> extends Fruit {

    ArrayList<T> fructs;

    public Box(float weight) {
        super(weight);
        fructs = new ArrayList<>();
    }

    public int getArraySize() {
        return fructs.size();
    }

    public void add(T model) {
        fructs.add(0, model);
        System.out.println("Добавили в корзину элемент: " + model);
    }

    public ArrayList<T> getFructs() {
        return fructs;
    }

    public float getWeight() {
        float sumWeightProducts = 0.0f;
        for (Fruit e : fructs) {
            sumWeightProducts += e.getWeight();
        }
        return sumWeightProducts;
    }

    public boolean compare(Fruit other) {

        return Math.abs(getWeight() - other.getWeight()) < 0.0001;
    }

    public void shiftSingleItem(Box<T> box2) {
        if (isProductsComparable(box2)) {
            System.out.print("Запрещено смешивать фрукты! Используйте другие фрукты или корзину!\r\n");
        } else {

            for (int i = fructs.size() - 1; i >= 0; i--) {
                box2.getFructs().add(fructs.get(i));
                fructs.remove(i);
            }

            System.out.println("Пересыпание прошло успешно : " + box2);
        }
    }

    public boolean isProductsComparable(Box<T> otherBox) {
        return this.getClass() != otherBox.getClass();
    }

    @Override
    public String toString() {
        return "Масса коробки: " + this.getWeight();
    }
}