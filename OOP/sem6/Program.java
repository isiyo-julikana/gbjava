package OOP.sem6;

public class Program {

    public static void main(String[] args) {

        InputFromConsole input = new InputFromConsole();
        input.inputFromConsole();

        SaveToJson saveToJson = new SaveToJson(input.getOrder());
        saveToJson.saveToJson();

        System.out.println("Информация по заказу успешно сохранена в файл.");

    }

}