package main.java.eu.senla.javaEE.hotel.service;

import main.java.eu.senla.javaEE.hotel.api.dao.OptionDao;
import main.java.eu.senla.javaEE.hotel.api.service.OptionService;
import main.java.eu.senla.javaEE.hotel.model.Option;

import java.util.Comparator;
import java.util.List;

public class OptionServiceImpl implements OptionService {

    private final OptionDao optionDao;

    public OptionServiceImpl(OptionDao optionDao) {
        this.optionDao = optionDao;
    }

    @Override
    public void add(Option option) {
        if (option == null) {
            throw new RuntimeException("Cannot be null");
        }
        if (findByName(option.getName()) != null) {
            throw new RuntimeException("Already exists");
        }
        optionDao.add(option);
    }

    @Override
    public void remove(Option option) {
        optionDao.remove(option);
    }

    @Override
    public List<Option> getAll() {
        return optionDao.getAll();
    }

    @Override
    public Option findByName(String name) {
        for (Option option : optionDao.getAll()) {
            if (name.equals(option.getName())) {
                return option;
            }
        }
        return null;
    }

    @Override
    public List<Option> getAllSortedByPriceAsc() {
        List<Option> all = getAll();
        all.sort(Comparator.comparing(Option::getPrice));
        return all;
    }

    @Override
    public List<Option> getAllSortedByNameAsc() {
        List<Option> all = getAll();
        all.sort(Comparator.comparing(Option::getName));
        return all;
    }

    public Option findByNameStream(String name) {
        return optionDao.getAll().stream()
                .filter(option -> name.equals(option.getName()))
                .findFirst()
                .orElse(null);
    }
}
