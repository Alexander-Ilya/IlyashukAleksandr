package main.java.eu.senla.javaEE.hotel.model;

import java.math.BigDecimal;

public class Room {
    private Integer number;
    private Integer capacity; // Вместимость
    private BigDecimal price;
    private RoomLevel roomLevel; // количество звёзд
    private boolean status; // false - ремонтируемый; true - обслуживаемый
    private boolean statusBusy; // false - ремонтируемый; true - обслуживаемый



    public Room() {
    }

    public Room(Integer number) {
        this.number = number;
    }

    public Room(Integer number, Integer capacity, BigDecimal price, RoomLevel roomLevel) {
        this.number = number;
        this.capacity = capacity;
        this.price = price;
        this.roomLevel = roomLevel;
        this.status = true;
    }

    public Room(Integer number, Integer capacity, BigDecimal price, RoomLevel roomLevel, boolean status) {
        this.number = number;
        this.capacity = capacity;
        this.price = price;
        this.roomLevel = roomLevel;
        this.status = status;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public RoomLevel getRoomLevel() {
        return roomLevel;
    }

    public void setRoomLevel(RoomLevel roomLevel) {
        this.roomLevel = roomLevel;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatusBusy() {
        return statusBusy;
    }

    public void setStatusBusy(boolean statusBusy) {
        this.statusBusy = statusBusy;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", capacity=" + capacity +
                ", price=" + price +
                ", roomLevel=" + roomLevel +
                ", status=" + status +
                ", statusBusy=" + statusBusy +
                '}';
    }
}
