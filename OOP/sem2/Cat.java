package OOP.sem2;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate food) {
        if (satiety != true && food.decreeseFood(appetite) == true ){
            satiety = true;
        }


    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    void info() {
        System.out.println(name + " иммеет аппетит " + appetite + ".\n" + name + " идет есть.");
        String isHungry = !satiety ?  " не поел(а), мало еды в тарелке." : " поел(а).";
        System.out.println(name + isHungry);
    }
    

}

