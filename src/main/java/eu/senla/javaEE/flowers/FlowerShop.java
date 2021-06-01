package main.java.eu.senla.javaEE.flowers;


        public class FlowerShop {
            private static Worker worker = new Worker();

            public static void main(String[] args) {
                AFlower rose = new Rose("white", 10);
                AFlower narcissus = new Narcissus("yellow", 20);
                AFlower chrysanthemum  = new Chrysanthemum("pink", 30);
                Bouquet bouquet = worker.createBouquet(rose, rose, chrysanthemum);
                worker.printBouquet(bouquet);


            }
}
