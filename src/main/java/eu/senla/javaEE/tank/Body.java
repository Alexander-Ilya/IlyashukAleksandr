package main.java.eu.senla.javaEE.tank;

public class Body implements IProductPart {
    private Integer serialNumber;
    private String color;

    public Body(Integer serialNumber, String color) {
        this.serialNumber = serialNumber;
        this.color = color;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
