package org.example;

public class Toy {
    private final long ID;
    private final String name;
    private final Double weight;
    public Toy(long ID, String name, double weight) {
        this.ID = ID;
        this.name = name;
        this.weight = weight;
    }
    public long getID() {
        return ID;
    }
    public String getName() { return name; }
    public Double getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "(" + ID + " " + name + " " + weight + ")" + "\n";
    }
}
