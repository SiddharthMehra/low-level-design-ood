package MovieTicketBooking;

import java.util.Date;
import java.util.List;

public class Booking {

    public int bookingId;
    public int amount;
    public Date createdOn;
    public int totalSeats;
    public BookingStatus bookingStatus;
    public Payment payment;
    public List<Movie> tickets;
    public List<Seat> seats;

    public Booking(int bookingId, int amount, Date createdOn, int totalSeats, BookingStatus bookingStatus, Payment payment, List<Movie> tickets, List<Seat> seats) {
        this.bookingId = bookingId;
        this.amount = amount;
        this.createdOn = createdOn;
        this.totalSeats = totalSeats;
        this.bookingStatus = bookingStatus;
        this.payment = payment;
        this.tickets = tickets;
        this.seats = seats;
    }

}
