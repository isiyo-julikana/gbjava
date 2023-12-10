import java.util.Scanner;


public class InputFromConsole{

     private Scanner scanner = new Scanner(System.in);    

     private Order order;

     public Order getOrder() {
        return order;
    }

    public InputFromConsole(){
        order = new Order();
     }     

    public void inputFromConsole(){
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Double.parseDouble(prompt("Цена: ")));
    }

    private String prompt(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
    
}