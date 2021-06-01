package main.java.eu.senla.javaEE.flowers;

import java.util.Collections;

public class Worker {
    public Bouquet createBouquet(AFlower...flowers){
        Bouquet bouquet = new Bouquet();
        Collections.addAll(bouquet.getFlower(),flowers);
        bouquet.setPrice(calculatePrice(bouquet));
        return bouquet;
    }
    public void addFlower(Bouquet bouquet, AFlower flower){
        bouquet.getFlower().add(flower);
        int price = bouquet.getPrice() + flower.getPrice();
        bouquet.setPrice(price);

    } public void removeFlower(Bouquet bouquet, AFlower flower){
        bouquet.getFlower().remove(flower);
        int price = bouquet.getPrice() - flower.getPrice();
        bouquet.setPrice(price);

    }

    private Integer calculatePrice(Bouquet bouquet) {

        return bouquet.getFlower().stream()
                .map(AFlower::getPrice)
                .mapToInt(x -> x)
                .sum();
    }
    public void printBouquet(Bouquet bouquet){
        System.out.println(bouquet);
        System.out.println("Колоичество цветов в букете - " + bouquet.getFlower().size());
        System.out.println("Стоимость букета - " + bouquet.getPrice());
    }
}
