package main.java.eu.senla.javaEE.hotel.dao;

import main.java.eu.senla.javaEE.hotel.api.dao.AccommodationDao;
import main.java.eu.senla.javaEE.hotel.model.Accommodation;

import java.util.ArrayList;
import java.util.List;

public class AccommodationDaoImpl implements AccommodationDao {
    private final List<Accommodation> accommodations = new ArrayList<>();

    @Override
    public void add(Accommodation accommodation) {
        accommodations.add(accommodation);
    }

    @Override
    public void remove(Accommodation accommodation) {
        accommodations.remove(accommodation);
    }

    @Override
    public List<Accommodation> getAll() {
        return accommodations;
    }
}

