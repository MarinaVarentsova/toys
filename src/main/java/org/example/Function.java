package org.example;

public class Function {
    public void function(){}
    public static void addToy(){
        Lottery.addToys();
    }
    public static void  showToy() {
        Lottery.showToys();
    }
    //розыгрыш (Draw.draw) проведение розыгрыша
    public static void  DrawToy() {
        Draw.drawToy();
    }
    public static void  presentToy() {
        Present.presentToys();
    }

}
