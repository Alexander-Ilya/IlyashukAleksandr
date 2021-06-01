package main.java.eu.senla.javaEE.tank;

public class BuilderThirdPart implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        IProductPart engine = new Engine("123",500);
        System.out.println("Engine made");
        return engine;
    }
}
