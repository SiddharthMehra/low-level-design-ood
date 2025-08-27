package MovieTicketBooking;

import java.util.ArrayList;

public class Customer extends Person{

    public List<Booking> bookings = new ArrayList<>();

    public boolean createBooking(Booking booking) {
        return true;
    }

    public boolean updateBooking(Booking booking) {
        return true;
    }

    public boolean deleteBooking(Booking booking) {
        return true;
    }
}
