package main.java.eu.senla.javaEE.flowers;

public class Rose extends AFlower {


    public Rose(String color, int price) {
        setColor(color);
        setPrice(price);

    }

    @Override
    public String toString() {
        return "Rose("+"price=" +  getPrice() + ", color=" + getColor() + '\'' +"}";
    }
}
