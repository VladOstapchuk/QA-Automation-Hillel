import org.HomeWorksQAAutomationJava.HomeWork11_Exceptions.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.ParseException;

public class HotelTest {

    private Hotel hotelTest;
    private Reservation reservationTest1;
    private Reservation reservationTest2;
    private Reservation reservationTest3;
    private Reservation reservationTest4;

    @BeforeClass
    public void setupBeforeClass() throws ParseException {
        hotelTest = new Hotel();
        reservationTest1 = new Reservation(23, "20.05.2024", "25.05.2024");
        reservationTest2 = new Reservation(24, "20.05.2024", "25.05.2024");

        //reservationTest3 - Невірний формат дати (перша дата більша за другу)
        reservationTest3 = new Reservation(25, "18.05.2024", "14.04.2024");
        reservationTest4 = new Reservation(100, "18.05.2024", "25.06.2024");

    }

    //Тест перевіряє успішне бронювання номера.
    //так як метода перевірки всіх попередньо заброньованих кімнат не існує,
    // то порівнюю відповідь що отримав з очікуваною.
    @Test
    public void testBookRoomSuccessfully() throws RoomAlreadyBookedException, InvalidDateException {
        Assert.assertEquals(hotelTest.bookRoom(reservationTest1),
                "Ви успішно забронювали кімнату! Приємного відпочинку!" +
                        "\n" + reservationTest1.toString());
    }

    //Перевіряє, що виключення RoomAlreadyBookedException кидається при спробі бронювання вже заброньованого номера.
    @Test(expectedExceptions = RoomAlreadyBookedException.class)
    public void testBookRoomAlreadyBooked() throws RoomAlreadyBookedException, InvalidDateException {
        hotelTest.bookRoom(reservationTest2);
        hotelTest.bookRoom(reservationTest2);
    }

    //Перевіряє, що виключення InvalidDateException кидається при спробі бронювання з некоректною датою.
    @Test(expectedExceptions = InvalidDateException.class)
    public void testBookRoomInvalidDate() throws RoomAlreadyBookedException, InvalidDateException {
        hotelTest.bookRoom(reservationTest3);
    }

    //Перевіряє, що виключення ReservationNotFoundException кидається при спробі скасування неіснуючого бронювання.
    @Test(expectedExceptions = ReservationNotFoundException.class)
    public void testCancelReservationNotFound() throws ReservationNotFoundException {
        hotelTest.cancelReservation(reservationTest4);
    }

    //Перевіряє успішне скасування бронювання.
    @Test
    public void testCancelReservationSuccessfully() throws ReservationNotFoundException {
        Assert.assertEquals(hotelTest.cancelReservation(reservationTest1),
                "Ваше бронювання успішно скасовано!" +
                        "\n" + reservationTest1.toString());
    }

    //Перевіряє доступність номера на різні дати.
    // Перевіряю обидва випадки - True and False
    @Test
    public void testIsRoomAvailable() throws InvalidDateException, RoomAlreadyBookedException, ReservationNotFoundException {
        hotelTest.bookRoom(reservationTest1);
        hotelTest.cancelReservation(reservationTest2);
        Assert.assertFalse(hotelTest.isRoomAvailable(reservationTest1));
        Assert.assertTrue(hotelTest.isRoomAvailable(reservationTest2));
    }

    //Перевіряє, що виключення InvalidDateException кидається при перевірці доступності з некоректною датою.
    @Test(expectedExceptions = InvalidDateException.class)
    public void testIsRoomAvailableInvalidDate() throws InvalidDateException {
        hotelTest.isRoomAvailable(reservationTest3);
    }
}