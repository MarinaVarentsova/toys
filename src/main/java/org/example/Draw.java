package org.example;

public class Draw {
    //сервис розыгрыша призов
    public static int drawToy() {
        int i = Lottery.sizeFile();
        int j = (int)(Math.random()*6) + 1;
        if (i < j){
            return 0;
        }
        return j;
    }
}
