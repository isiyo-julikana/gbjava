package OOP.sem1;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("Яблоко", 20){});
        vm.addProduct(new Product("Груша", 30){});
        vm.addProduct(new Chocolate("Шоколад №1", 40, 50));
        vm.addProduct(new Chocolate("Шоколад №2", 50, 96));
                System.out.println(vm);

    }
}

