package main.java.eu.senla.javaEE.hotel;

import main.java.eu.senla.javaEE.hotel.model.*;
import main.java.eu.senla.javaEE.hotel.api.service.AccommodationService;
import main.java.eu.senla.javaEE.hotel.api.service.GuestService;
import main.java.eu.senla.javaEE.hotel.api.service.OptionService;
import main.java.eu.senla.javaEE.hotel.api.service.RoomService;
import main.java.eu.senla.javaEE.hotel.dao.AccommodationDaoImpl;
import main.java.eu.senla.javaEE.hotel.dao.GuestDaoImpl;
import main.java.eu.senla.javaEE.hotel.dao.OptionDaoImpl;
import main.java.eu.senla.javaEE.hotel.dao.RoomDaoImpl;
import main.java.eu.senla.javaEE.hotel.service.AccommodationServiceImpl;
import main.java.eu.senla.javaEE.hotel.service.GuestServiceImpl;
import main.java.eu.senla.javaEE.hotel.service.OptionServiceImpl;
import main.java.eu.senla.javaEE.hotel.service.RoomServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;

import static main.java.eu.senla.javaEE.hotel.model.RoomLevel.THREE;
import static main.java.eu.senla.javaEE.hotel.model.RoomLevel.TWO;

public class Hotel {


    public static void main(String[] args) {





        GuestService guestService = new GuestServiceImpl(new GuestDaoImpl());
        guestService.add(new Guest("Александр", "Иванов", "+378595656565", Sex.MALE, 23));
        guestService.add(new Guest("Андрей", "Петроов", "+378595656566", Sex.MALE, 32));
        guestService.add(new Guest("Ольга", "Петроова", "+378595656569", Sex.FEMALE, 30));

        OptionService optionService = new OptionServiceImpl(new OptionDaoImpl());
        optionService.add(new Option("Баня", BigDecimal.TEN));
        optionService.add(new Option("Бильярд", new BigDecimal("15")));
        optionService.add(new Option("Кондиционер", new BigDecimal("25")));
        optionService.add(new Option("Холодильник", new BigDecimal("5")));
        optionService.add(new Option("Фен", new BigDecimal("3")));

        RoomService roomService = new RoomServiceImpl(new RoomDaoImpl());
        roomService.add(new Room(1));
        roomService.add(new Room(2, 3, new BigDecimal(10), TWO));
        roomService.add(new Room(3, 2, new BigDecimal(15), THREE));
        roomService.add(new Room(4, 2, new BigDecimal(15), THREE, false));

        AccommodationService accommodationService = new AccommodationServiceImpl(new AccommodationDaoImpl());
        accommodationService.add(new Accommodation(roomService.findByNumber(1), guestService.findByName("Ольга"), LocalDate.of(2021, 5, 20), LocalDate.of(2021, 5, 25)));


        System.out.println("roomService.getAll() = " + roomService.getAll());
        System.out.println("guestService.getAll() = " + guestService.getAll());
        System.out.println("optionService.getAll() = " + optionService.getAll());
        System.out.println("accommodationService.getAll() = " + accommodationService.getAll());


        // меняем цену бани
        optionService.findByName("Баня")
                .setPrice(new BigDecimal("100.23"));
        // меняем цену Бильярд
        optionService.findByName("Бильярд")
                .setPrice(new BigDecimal("50.23"));
        System.out.println("Бильярд = " + optionService.findByName("Бильярд").getPrice());
        System.out.println("optionService.getAll() = " + optionService.getAll());





        System.out.println(optionService.getAllSortedByPriceAsc());
        System.out.println(optionService.getAllSortedByNameAsc());



//
//
//
///*
//        RoomService roomService = new RoomServiceImpl();
//        roomService.add(new Room(105));
//        // селим клиента
//        roomService.findByNumber(105)
//                .setGuest(guest);
//        roomService.findByNumber(105)
//                .setGuest(null);*/
//
//




    }
}
