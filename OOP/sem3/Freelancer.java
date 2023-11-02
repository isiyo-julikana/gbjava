package OOP.sem3;


public class Freelancer extends Employee {

    public Freelancer(String name, String surName,double salary, int age) {
        super(name, surName,salary,age);
    }

    @Override
    public double calculateSalary() {
        return salary * 20.8 * 8;
    }

    @Override
    public int ageSort() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %d; Фриланс; Среднемесячная заработная плата %.2f",
                surName, name, age, salary);
    }
}