package main.java.eu.senla.javaEE.hotel.service;

import main.java.eu.senla.javaEE.hotel.api.dao.RoomDao;
import main.java.eu.senla.javaEE.hotel.api.service.RoomService;
import main.java.eu.senla.javaEE.hotel.model.Room;

import java.util.List;

public class RoomServiceImpl implements RoomService {

    private final RoomDao roomDao;

    public RoomServiceImpl(RoomDao roomDao) {
        this.roomDao = roomDao;
    }

    @Override
    public void add(Room room) {
        roomDao.add(room);

    }

    @Override
    public void remove(Room room) {
        roomDao.remove(room);
    }

    @Override
    public List<Room> getAll() {
        return roomDao.getAll();
    }

    @Override
    public Room findByNumber(int number) {
        for (Room room : roomDao.getAll()){
            if (number == room.getNumber()){
                return room;
            }
        }
        return null;
    }
}
