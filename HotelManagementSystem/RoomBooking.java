package HotelManagementSystem;

import CarRentalSystem.Notification;

import java.util.Date;
import java.util.List;

public class RoomBooking {
    private String reservationNumber;
    private Date startDate;
    private int durationDays;
    private BookingStatus status;
    private Date checkedIn;
    private Date checkedOut;

    private int guestId;
    private Room room;
    private Invoice invoice;
    private List<Notification> notifications;

    public static RoomBooking fetchReservationDetails(String reservationNumber) {
        return null;
    }

}
