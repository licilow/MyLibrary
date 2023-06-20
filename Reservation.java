package model.reservation;

import model.customer.Customer;
import model.room.IRoom;

import java.util.Date;

/**
 * @author joseneto
 *
 */
public class Reservation {

    private final Customer Customer;
    private final IRoom Room;
    private final Date checkInDate;
    private final Date checkOutDate;

    public Reservation(final Customer Customer, final IRoom Room,
                       final Date checkInDate, final Date checkOutDate) {
        this.Customer = Customer;
        this.Room = Room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public IRoom getRoom() {
        return this.Room;
    }

    public Date getCheckInDate() {
        return this.checkInDate;
    }

    public Date getCheckOutDate() {
        return this.checkOutDate;
    }

    @Override
    public String toString() {
        return "Customer: " + this.Customer.toString()
                + "\nRoom: " + this.Room.toString()
                + "\nCheckIn Date: " + this.checkInDate
                + "\nCheckOut Date: " + this.checkOutDate;
    }
}
