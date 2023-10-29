package OOP.sem2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreeseFood(int f) {
        int dif = food - f;
        if (dif < 0){
            System.out.println("Мало еды!");
            return false;
        }
        food -= f;
        return true;
    }

    public void addFood(int food) {
        System.out.println("*Добавляем еду*");
        this.food += food;
    }

    public void info() {
        System.out.println("Миска: " + food);
    }


    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
}