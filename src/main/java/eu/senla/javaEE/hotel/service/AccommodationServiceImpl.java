package main.java.eu.senla.javaEE.hotel.service;

import main.java.eu.senla.javaEE.hotel.api.dao.AccommodationDao;
import main.java.eu.senla.javaEE.hotel.api.service.AccommodationService;
import main.java.eu.senla.javaEE.hotel.model.Accommodation;

import java.util.List;

public class AccommodationServiceImpl implements AccommodationService {

    private final AccommodationDao accommodationDao;

    public AccommodationServiceImpl(AccommodationDao accommodationDao) {
        this.accommodationDao = accommodationDao;
    }


    @Override
    public void add(Accommodation accommodation) {
        accommodationDao.add(accommodation);

    }

    @Override
    public void remove(Accommodation accommodation) {
        accommodationDao.remove(accommodation);
    }

    @Override
    public List<Accommodation> getAll() {
        return  accommodationDao.getAll();
    }

    @Override
    public Accommodation findByName(String name) {
        return null;
    }
}

