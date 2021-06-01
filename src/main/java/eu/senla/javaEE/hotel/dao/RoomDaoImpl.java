package main.java.eu.senla.javaEE.hotel.dao;

import main.java.eu.senla.javaEE.hotel.api.dao.RoomDao;
import main.java.eu.senla.javaEE.hotel.model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomDaoImpl implements RoomDao {

    private final List<Room> rooms = new ArrayList<>();

    @Override
    public void add(Room room) {
        rooms.add(room);
    }

    @Override
    public void remove(Room room) {
        rooms.remove(room);
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }
}
