package org.HomeWorksQAAutomationJava.HomeWork11_Exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {

    private int roomNumber;
    private String startDate, endDate;
    private Date dateStart, dateEnd;


    public int getRoomNumber() {
        return roomNumber;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    //конструктор приймає дату у форматі строки, але в об'єкт вже заносить як дату
    public Reservation(int roomNumber, String startDate, String endDate) throws ParseException {
        this.roomNumber = roomNumber;
        this.dateStart = new SimpleDateFormat("dd.MM.yyyy").parse(startDate);
        this.dateEnd = new SimpleDateFormat("dd.MM.yyyy").parse(endDate);
    }


    //переписав, що при перегляді об'єкта дата поверталась в красивому форматі (в тому що і вводилась)
    @Override
    public String toString() {

        return "Резерв: кімната №: " + this.getRoomNumber() + "\n"
                + "Дата початку бронювання: " + new SimpleDateFormat("dd.MM.yyyy").format(this.getDateStart()) + "\n"
                + "Дата закінчення бронювання: " + new SimpleDateFormat("dd.MM.yyyy").format(this.getDateEnd())
                ;
    }


    //якщо це один і той самий об'єкт повертаю true
    //true Повертаю коли або однаковий номер кімнати та інтервали дат накладаються/перетинаються
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Reservation objReserv = (Reservation) obj;

        if (this.roomNumber == objReserv.getRoomNumber() &&
                this.getDateStart().before(objReserv.getDateEnd()) &&
                objReserv.getDateStart().before(this.getDateEnd())
        )
            return true;
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}