package main.java.eu.senla.javaEE.hotel.api.service;

import main.java.eu.senla.javaEE.hotel.model.Accommodation;

import java.util.List;

public interface AccommodationService {

    void add (Accommodation accommodation);
    void remove(Accommodation accommodation);

    List<Accommodation> getAll();

    Accommodation findByName(String name);

}
