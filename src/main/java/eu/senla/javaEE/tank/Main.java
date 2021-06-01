package main.java.eu.senla.javaEE.tank;

public class Main {
    public static void main(String[] args) {
        IProduct tank = new Tank();
        AssemblyLine tankLine = new AssemblyLine();
        BuilderFirstPart body = new BuilderFirstPart();
        BuilderSecondPart tower = new BuilderSecondPart();
        BuilderThirdPart engine = new BuilderThirdPart();
        //tank = tankLine.assembleProduct(body.buildProductPart(),  engine.buildProductPart());
    }
}
