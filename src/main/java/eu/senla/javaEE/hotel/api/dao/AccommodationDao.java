package main.java.eu.senla.javaEE.hotel.api.dao;

import main.java.eu.senla.javaEE.hotel.model.Accommodation;

import java.util.List;

public interface AccommodationDao {
    void add(Accommodation accommodation);
    void remove (Accommodation accommodation);

    List<Accommodation> getAll();
}
