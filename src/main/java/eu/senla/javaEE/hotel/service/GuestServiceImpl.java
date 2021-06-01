package main.java.eu.senla.javaEE.hotel.service;

import main.java.eu.senla.javaEE.hotel.api.dao.GuestDao;
import main.java.eu.senla.javaEE.hotel.api.service.GuestService;
import main.java.eu.senla.javaEE.hotel.model.Guest;

import java.util.List;

public class GuestServiceImpl implements GuestService {

    private final GuestDao guestDao;

    public GuestServiceImpl(GuestDao guestDao) {
        this.guestDao = guestDao;
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);

    }

    @Override
    public void remove(Guest guest) {
        guestDao.remove(guest);

    }

    @Override
    public List<Guest> getAll() {
        return guestDao.getAll();
    }

    @Override
    public Guest findByName(String name) {
        for (Guest guest : guestDao.getAll()) {
            if (name.equalsIgnoreCase(guest.getName())) {
                return guest;
            }
        }
        return null;
    }
}

