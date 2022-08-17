package model;

import java.util.ArrayList;
import java.util.Date;

public class Reservation {
    private final Customer customer;
    private final IRoom room;
    private final Date checkInDate;
    private final Date checkOutDate;

    public Reservation(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    // Get relevant customer information with get statements.
    public IRoom getRoom() {
        return this.room;
    }
    public Date getCheckInDate() {
        return this.checkInDate;
    }
    public Date getCheckOutDate() {
        return this.checkOutDate;
    }

    @Override
    public String toString() {
        return "Customer: " + customer + ", Room: " + room + ", Check in: " + checkInDate + ", Check out: " + checkOutDate;
    }

    //IntelliJ suggested adding this. WHY did I add it? Why did I add it HERE?
    public void add(ArrayList<Reservation> reservation) {
    }
}
