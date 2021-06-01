package main.java.eu.senla.javaEE.flowers;

public class Narcissus extends AFlower {
    public Narcissus(String color, int price) {
        setColor(color);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Narcissus{("+"price=" +  getPrice() + ", color=" + getColor() + '\'' +"}";
    }
}
