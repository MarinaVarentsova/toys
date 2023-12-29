package org.example;

public class Main {
    public static void main(String[] args) {
        Menu.listProgram();
        int command = Menu.command();
        Menu.trigger(command);
    }
}