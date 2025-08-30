package RestaurantManagementSystem;

import StackOverflow.Notification;

import java.util.Date;
import java.util.List;

public class Reservation {

    private int reservationId;
    private Date creationTime;
    private int peopleCount;
    private ReservationStatus reservationStatus;
    private String notes;
    private Date checkInTime;
    private Customer customer;
    private Table[] tables;
    private List<Notification> notifications;

    public boolean updatePeopleCount(int count) {
        return true;
    }
}
