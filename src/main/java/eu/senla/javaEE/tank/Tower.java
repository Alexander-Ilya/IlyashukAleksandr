package main.java.eu.senla.javaEE.tank;

public class Tower implements IProductPart{
    private int caliber;

    public int getCaliber() {
        return caliber;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public Tower(int caliber) {
        this.caliber = caliber;
    }
}
