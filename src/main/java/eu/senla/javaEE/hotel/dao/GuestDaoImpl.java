package main.java.eu.senla.javaEE.hotel.dao;

import main.java.eu.senla.javaEE.hotel.api.dao.GuestDao;
import main.java.eu.senla.javaEE.hotel.model.Guest;

import java.util.ArrayList;
import java.util.List;

public class GuestDaoImpl implements GuestDao {

    private final List<Guest> guests = new ArrayList<>();

    @Override
    public void add(Guest guest) {
        guests.add(guest);
    }

    @Override
    public void remove(Guest guest) {
        guests.remove(guest);
    }

    @Override
    public List<Guest> getAll() {
        return guests;
    }
}
