package main.java.eu.senla.javaEE.hotel.api.service;

import main.java.eu.senla.javaEE.hotel.model.Room;

import java.util.List;

public interface RoomService {
     void add(Room room);
     void remove (Room room);
     List<Room> getAll();

     Room findByNumber(int number) ;

}
