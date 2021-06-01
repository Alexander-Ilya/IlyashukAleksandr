package main.java.eu.senla.javaEE.hotel.api.dao;

import main.java.eu.senla.javaEE.hotel.model.Room;

import java.util.List;

public interface RoomDao {
    void add(Room guest);
    void remove(Room guest);

    List<Room> getAll();
}
