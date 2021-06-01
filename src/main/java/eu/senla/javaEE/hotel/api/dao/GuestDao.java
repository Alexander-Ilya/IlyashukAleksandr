package main.java.eu.senla.javaEE.hotel.api.dao;

import main.java.eu.senla.javaEE.hotel.model.Guest;

import java.util.List;

public interface GuestDao {

    void add(Guest guest);
    void remove(Guest guest);

    List<Guest> getAll();

}
