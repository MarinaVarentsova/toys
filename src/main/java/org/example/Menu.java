package org.example;

import java.util.Scanner;
public class Menu {
    public static void listProgram() {
        System.out.print("Выберите команду по работе с заметками: " +
                "\n1 - добавить игрушки в списоку на розыгрыш" +
                "\n2 - посмотреть список игрушек на розыгрыш" +
                "\n3 - провести розыгрыш" +
                "\n4 - посмотреть список призов" +
                "\n5 - забрать приз");
    }

    public static int command() {
        System.out.print("\nвведите команду: ");
        Scanner scanner = new Scanner(System.in);
        int command = Integer.parseInt(scanner.nextLine());
        scanner.close();
        return command;
    }

    public static void trigger(int command) {
        if (command == 1) {
            Function.addToy();
        }
        if (command == 2) {
            Function.showToy();
        }
        if (command == 3) {
            Function.DrawToy();
        }
        if (command == 4) {
            Function.showPresent();
        }
        if (command == 5) {
            Function.takePresent();
        }
        if (command > 5) {
            System.out.println("Ошибка ввода команды");
        }
    }
}
