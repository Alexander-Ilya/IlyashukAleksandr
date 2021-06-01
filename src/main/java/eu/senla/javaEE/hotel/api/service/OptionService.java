package main.java.eu.senla.javaEE.hotel.api.service;

import main.java.eu.senla.javaEE.hotel.model.Option;

import java.util.List;

public interface OptionService {
    void add(Option option);
    void remove(Option option);

    List<Option> getAll();

    Option findByName(String name);

    List<Option> getAllSortedByPriceAsc();

    List<Option> getAllSortedByNameAsc();
}
