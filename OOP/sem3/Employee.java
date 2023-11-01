package OOP.sem3;

/**
 * Рабочий (базовый тип)
 */
public abstract class Employee implements Comparable<Employee>{

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    public Employee(String surName, String name, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Расчет среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, salary, calculateSalary());
    }
}
