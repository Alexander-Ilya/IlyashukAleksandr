package main.java.eu.senla.javaEE.tank;

public class BuilderSecondPart implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        IProductPart tower = new Tower(2);
        System.out.println("Tower made");
        return tower;
    }
}
