package org.example;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;

public class Present {

    public static void addPresent() {
        creatFile();
        int i = Draw.drawToy();
        System.out.println("выпал приз под номером: " + (i + 1));
        ArrayList<String> list = Lottery.eletementsLottery();
        ArrayList<String> present = Present.eletementsPresent();
        present.add(list.get(i));
        System.out.println("ваш призXXX:" + list.get(i));
        Present.writeFile(present);
    }

    public static void takePresent() {
        creatFile();
        ArrayList<String> list = eletementsPresent();
        System.out.println(list.size());
        System.out.println("данный приз был получен" + list.get(0));
        list.remove(0);
        Present.changeWriteFile(list);
    }

    // сервис учета призов (пополнение и удаление)
    public static void creatFile() {
        try {
            File file = new File("present.txt");
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }
    }

    public static void showPresent() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("present.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }

    public static void writeFile(ArrayList<String> present) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("present.txt"));
            for (String elem : present) { // Перебираем элементы массива
                writer.append(String.valueOf(elem)); // Записываем элементы в файл, приводим целые числа к строковому формату
                writer.flush(); // Очищаем буфер потока
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }

    public static ArrayList<String> eletementsPresent() {
        ArrayList<String> presents = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("present.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                presents.add(line);
            }
            System.out.println(presents);
            reader.close();

        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }
        return presents;
    }

    public static void changeWriteFile(ArrayList<String> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("present.txt"));
            writer.write(list.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }
}
