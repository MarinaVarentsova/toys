package org.example;

import java.io.*;
import java.util.ArrayList;

public class Lottery {
    public Lottery(){};
    public static void addToys() {
        creatFile();
        ArrayList<Toy> info = Toy.get_info();
        System.out.println(info);
        writeFile(info);

    }

    public static void writeFile(ArrayList<Toy> info){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("lottery.txt", true));
            writer.append(info.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }

    public static void  showToys() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("lottery.txt"));
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
    //розыгрыш (Draw.draw) проведение розыгрыша
    public static void creatFile() {
        try {
            File file = new File("lottery.txt");
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
    public static int sizeFile() {
        ArrayList<String> copyFile = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("lottery.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                copyFile.add(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }
        return copyFile.size();
    }
    public static ArrayList<String> eletementsLottery() {
        ArrayList<String> lottery = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("lottery.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                lottery.add(line);
            }
            System.out.println(lottery);
            reader.close();

        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }
        return lottery;
    }


}
