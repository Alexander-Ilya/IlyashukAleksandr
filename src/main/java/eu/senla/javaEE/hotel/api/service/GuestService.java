package main.java.eu.senla.javaEE.hotel.api.service;

import main.java.eu.senla.javaEE.hotel.model.Guest;

import java.util.List;

public interface GuestService {
    void add(Guest guest);
    void remove(Guest guest);

    List<Guest> getAll();

    Guest findByName(String name);
}
