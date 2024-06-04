package org.HomeWorksQAAutomationJava.HomeWork11_Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Reservation> bookingCollection = new ArrayList<>();

    public Hotel() {
        this.bookingCollection = bookingCollection;
    }


    //Резервація кімнати - додаємо Резервацію в List
    public String bookRoom(Reservation newreservation) throws RoomAlreadyBookedException, InvalidDateException {

        if (bookingCollection.isEmpty()) {
            bookingCollection.add(newreservation);
        } else {
            for (Reservation reserve : bookingCollection) {

                if (reserve.equals(newreservation)) {
                    throw new RoomAlreadyBookedException("Кімнату " + reserve.getRoomNumber() + " на вказані дати вже було заброньовано");
                }
                if (newreservation.getDateEnd().before(newreservation.getDateStart())) {
                    throw new InvalidDateException("Невірний формат дати! Дата початку бронювання більша за дату кінця бронювання!");

                } else {
                    bookingCollection.add(newreservation);
                    break;
                }
            }
        }
        return "Ви успішно забронювали кімнату! Приємного відпочинку!" +
                "\n" + newreservation.toString();
    }

    //тут(в циклі for) не застосовую equals, тому що він спрацює якщо буде перетинання по датам.
    public String cancelReservation(Reservation newreservation) throws ReservationNotFoundException {
        for (Reservation reservation : bookingCollection) {
            if (reservation == newreservation) {
                bookingCollection.remove(reservation);
                return "Ваше бронювання успішно скасовано!" +
                        "\n" + newreservation.toString();
            }
        }
        throw new ReservationNotFoundException("Такий резерв на вказані дати не знайдено: \n" + newreservation.toString());
    }

    // повертає boolean через назву що починаэться з IS
    public boolean isRoomAvailable(Reservation newreservation) throws InvalidDateException {
        for (Reservation reservation : bookingCollection) {
            if (newreservation.getDateEnd().before(newreservation.getDateStart())) {
                throw new InvalidDateException("Невірний формат дати! Дата початку бронювання більша за дату кінця бронювання!");
            }
            if (reservation.equals(newreservation)) {
                return false;
            }
        }
        return true;
    }
}



