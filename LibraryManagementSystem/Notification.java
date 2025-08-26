package LibraryManagementSystem;

import java.util.Date;

public abstract class Notification {

    private String notificationId;
    private Date createdAtDate;
    private String content;
    private BookLending bookLending;
    private BookReservation bookReservation;

    public abstract boolean sendNotification();
}
