package main.java.eu.senla.javaEE.hotel.dao;

import main.java.eu.senla.javaEE.hotel.api.dao.OptionDao;
import main.java.eu.senla.javaEE.hotel.model.Option;

import java.util.ArrayList;
import java.util.List;

public class OptionDaoImpl implements OptionDao {

    private final List<Option> options = new ArrayList<>();

    @Override
    public void add(Option Option) {
        options.add(Option);
    }

    @Override
    public void remove(Option Option) {
        options.remove(Option);
    }

    @Override
    public List<Option> getAll() {
        return new ArrayList<>(options);
    }
}
