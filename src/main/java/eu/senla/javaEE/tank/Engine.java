package main.java.eu.senla.javaEE.tank;

public class Engine implements IProductPart{
    private String serialNumber;
    private int power;

    public Engine(String serialNumber, int power) {
        this.serialNumber = serialNumber;
        this.power = power;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
