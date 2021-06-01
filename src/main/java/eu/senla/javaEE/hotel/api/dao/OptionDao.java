package main.java.eu.senla.javaEE.hotel.api.dao;

import main.java.eu.senla.javaEE.hotel.model.Option;

import java.util.List;

public interface OptionDao {

    void add(Option option);
    void remove(Option option);

    List<Option> getAll();
}
