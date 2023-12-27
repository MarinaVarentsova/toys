package org.example;
import java.util.Scanner;
public class Menu {
    public static void  listProgram(){
        System.out.println("\n Выберите команду по работе с заметками: " +
        "\n 1 - добавить игрушки в списоку на розыгрыш" +
        "\n 2 - посмотреть список игрушек на розыгрыш" +
        "\n 3 - провести розыгрыш" +
        "\n 4 - забрать приз" +
        "\n 5 - выход");
    }
    public static void command(){
        while(true){
            listProgram();
            System.out.println("\nвведите команду: ");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
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
                Function.presentToy();
            }
            if (command == 5) {
                break;
            }
            else {System.out.println("Ошибка ввода команды"); }
        }
    }
}
