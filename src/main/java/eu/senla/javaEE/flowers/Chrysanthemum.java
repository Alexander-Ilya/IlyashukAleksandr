package main.java.eu.senla.javaEE.flowers;

public class Chrysanthemum extends AFlower {
    public Chrysanthemum(String color, int price) {
        setColor(color);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Chrysanthemum{("+"price=" +  getPrice() + ", color=" + getColor() + '\'' +"}";
    }
}
