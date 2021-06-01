package main.java.eu.senla.javaEE.tank;

public class BuilderFirstPart implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        IProductPart body = new Body(1234, "green");
        System.out.println("Body made");
        return body;
    }
}
