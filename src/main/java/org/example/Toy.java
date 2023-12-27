package org.example;

import java.awt.geom.Arc2D;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Toy{
    private long ID;
    private String name;
    private Double weigth;
    public Toy(long ID, String name, double weigth) {
        this.ID = ID;
        this.name = name;
        this.weigth = weigth;
    }
    public Long getID() {return ID; }
    public void setID(Long ID) {
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

    @Override
    public String toString() {
        return "(" + ID + " " + name + " " + weigth + ")" + "\n";
    }


//    public static void writer() {
//        try {
//            FileWriter fileWriter = new FileWriter("file_system.txt", true);
//            String testString = add_toys();
//            fileWriter.write(testString);
//            fileWriter.close();
//        } catch (IOException exception) {
//            System.err.println("Error writing to file: ");
//        }
//    }

}
