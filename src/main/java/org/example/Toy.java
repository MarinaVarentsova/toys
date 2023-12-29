package org.example;
import java.util.*;

public class Toy{
    private UUID ID;
    private String name;
    private Double weigth;
    public Toy(UUID ID, String name, double weigth) {
        this.ID = ID;
        this.name = name;
        this.weigth = weigth;
    }
    public UUID getID() {return ID; }
    public void setID(UUID ID) {
        this.ID = ID;
    }
    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }
    public Double getWeigth() { return weigth; }

    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }
    public static ArrayList<Toy> get_info(){
        //пользователь вводит наименование и вес игрушки
        //сканер выдает ошибки, думаю проблема именно в сканере, который считывает пустые символы и переносы
        //не смогла это победить
//        System.out.print("введите наименование игрушки: ");
//        Scanner nameToy = new Scanner(System.in);
//        String name = nameToy.nextLine();
//        nameToy.close();
//        System.out.print("введите вес игрушки: ");
//        Scanner weigthToy = new Scanner(System.in);
//        double weigth = Double.parseDouble(weigthToy.nextLine());
//        weigthToy.close();
        ArrayList<Toy> info = new ArrayList<>();
        UUID ID;
        ID = UUID.randomUUID();
        String title = "игрушка";
        int i = (int)(Math.random()*10)+1;

        String name = title + i;
        double weigth = Math.ceil(Math.random()*100);
        info.add(new Toy(ID, name, weigth));
        return info;
    }

    @Override
    public String toString() {
        return "(" + ID + " " + name + " " + weigth + ")" + "\n";
    }

}
