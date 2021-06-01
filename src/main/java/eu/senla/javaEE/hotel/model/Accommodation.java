package main.java.eu.senla.javaEE.hotel.model;

import java.time.LocalDate;

public class Accommodation {

    private Room room;
    private Guest guest;
    //    private List<Option> options;
    private LocalDate startDate;
    private LocalDate finishDate;

    public Accommodation() {
    }




    public Accommodation(Room room, Guest guest, LocalDate startDate, LocalDate finishDate) {
        this.room = room;
        this.guest = guest;
        this.startDate = startDate;
        this.finishDate = finishDate;

    }




    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }




    @Override
    public String toString() {
        return "Accommodation{" +
                "room=" + room +
                ", guest=" + guest +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                '}';
    }
}
