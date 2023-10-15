package sem6;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pb {
    private static HashMap<String, String> pb = new HashMap<String, String>();

   
    private static void addPB(String name, String phone) {  //добавляет запись по заданным имени и номеру телефона 
        pb.put(name, phone);
    }

    private static void delPB(String phone) { //удаляет запись по номеру телефона
        pb.remove(phone);
    }
 
    private static void savePB() throws IOException { //сохраняет БД в текстовом файле phone.txt
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("phone.txt")));
        for(Map.Entry<String,String> k: pb.entrySet()){
            writer.write(k.getKey() + " " + k.getValue()+System.lineSeparator());
        }
        writer.close();
    }

    public static void loadPB() throws IOException { // загружает БД из текстового файла phone.txt
        File file = new File("phone.txt");
        if (file.exists()){  //производит проверку на наличие файла
            BufferedReader reader = new BufferedReader(new FileReader(new File("phone.txt")));
            String act;
            while ((act=reader.readLine())!=null) {
                String[] dat = act.split(" ");
                pb.put(dat[0], dat[1]);
            }
            reader.close();
        }
    }

    
    public static void PrintPhonebook(){ //выводит на екран все записи БД
        System.out.println("Телефонный справочник: ");
        for(Map.Entry<String,String> k: pb.entrySet()){
            System.out.println(k.getValue()+": "+ k.getKey());
        }
    }

    
    
    public static String FindName(String number){ //производит поиск имени по номеру телефона заданому в качестве аргумента
        String result = pb.get(number); 
        if (result == null) return "абонент с таким номером не найдей";
        return result; //возвращает строку
    }

    
    
    public static String[] FindNumberPhone(String name){ //производит поиск списка номеров по имени заданое в качестве аргумента
        List <String> result = new ArrayList<String>();
        for (Map.Entry entry : pb.entrySet()) {
            if (name.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("абонент с таким именем не найден");
        return result.toArray(new String[0]); //возвращает массив строк
    }

    public static void main(String[] args) throws IOException {
        
        String act; //переменная описывает вызываемое действие

        
        loadPB(); //загрузка БД
        
        PrintPhonebook(); //вывод записей на экран

        
        System.out.println("выбор действия: (add)добавить данные, (del)удалить данные, (num) найти номера по имени, (name)найти имя, " +
                            "(save)сохранить, (exit)выход"); //вывод на экран описания возможных действий с указанием команд

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();
        while(!act.equals("exit")){
            //добавление записи
            if(act.equals("add")){
                System.out.println("Введите имя:");
                String name = bf.readLine();
                System.out.println("Введите телефон:");
                String phone = bf.readLine();
                addPB(phone, name);
            }else{
                //удаление записи
                if(act.equals("del")){
                    System.out.println("Введите телефон:");
                    String phone = bf.readLine();
                    delPB(phone);
                }else{
                    //поиск номеров по имени
                    if (act.equals("num")){
                        System.out.println("Введите имя:");
                        String name = bf.readLine();
                        String[] numbers = FindNumberPhone(name);
                        for (String number : numbers) {
                            System.out.println(number);
                        }
                    } else {
                        //поиск имени по номеру
                        if (act.equals("name")) {
                            System.out.println("Введите номер:");
                            String number = bf.readLine();
                            System.out.println(FindName(number));
                        } else {
                            //сохранение БД в файл
                            if(act.equals("save")){
                                savePB();
                            }
                        }
                    }
                }
            }
            //запрос на следующее действие
            System.out.println("выбор действия: (add)добавить данные, (del)удалить данные, (num) найти номера по имени, (name)найти имя, (save)сохранить, (exit)выход");
            act=bf.readLine();
        }
    }
}

