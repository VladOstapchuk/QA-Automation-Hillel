package org.HomeWorksQAAutomationJava.HomeWork11_Exceptions;

import java.text.ParseException;

public class HotelTest {

    public static void main(String[] args) throws ParseException {

        //Створення Готелю
        Hotel alibaba = new Hotel();

        //Створюю обє'кти резервації
        //res1 - Позитивний кейс
        Reservation res1 = new Reservation(23, "20.05.2024", "25.05.2024");
        //res2 - Дати перетинаються з res1
        Reservation res2 = new Reservation(23, "18.05.2024", "27.05.2024");
        //res3 - Невірний формат дати (перша дата більша за другу)
        Reservation res3 = new Reservation(25, "18.05.2024", "14.04.2024");
        //res4 - Створюю бронювання потіи анулюю його
        Reservation res4 = new Reservation(06, "18.05.2024", "25.05.2024");


        //Резервую кімнату res1
        try {
            System.out.println(alibaba.bookRoom(res1));
        } catch (RoomAlreadyBookedException | InvalidDateException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------");

        //Резервую кімнату res2 - дати перетинаються з res1 (бронювання неможливе)
        try {
            System.out.println(alibaba.bookRoom(res2));
        } catch (RoomAlreadyBookedException | InvalidDateException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------");

        //Відміняю кімнату res2 - дати перетинаються з res1 (такий резерв не знайдено)
        try {
            System.out.println(alibaba.cancelReservation(res2));
        } catch (ReservationNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------");

        //Перевіряю чи вільна кімнату res1 (зайнята на дати res1)
        try {
            System.out.println(alibaba.isRoomAvailable(res1));
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }

        //Перевіряю чи вільна кімнату res2 (зайнята на дати res1)
        try {
            System.out.println(alibaba.isRoomAvailable(res2));
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }

        //Резервую кімнату res3 (Невірний формат дати)
        try {
            System.out.println(alibaba.bookRoom(res3));
        } catch (RoomAlreadyBookedException | InvalidDateException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------");

        //Резервую кімнату res4
        try {
            System.out.println(alibaba.bookRoom(res4));
        } catch (RoomAlreadyBookedException | InvalidDateException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------");

        //Анулюю бронювання -  кімнату res4
        try {
            System.out.println(alibaba.cancelReservation(res4));
        } catch (ReservationNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------");
    }
}
