package OOP.sem3;

import java.util.Arrays;
import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };
        int minAge = 18;
        int maxAge = 70;
        int diffAge = maxAge - minAge;
        int age = random.nextInt(diffAge + 1);
        int salary = random.nextInt(60000);
        if (random.nextBoolean()) {
            return new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary,
                    age);
        } else {
            return new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)],
                    salary, age);
        }
    }

    
    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }

    public static void main(String[] args) {
        Employee[] employees = generateEmployees(12);

        Arrays.sort(employees, new AgeComparator());
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}