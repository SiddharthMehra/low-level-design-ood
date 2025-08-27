package MovieTicketBooking;

import java.util.Date;

public abstract class Notification {

    public int notificationId;
    public Date createdOn;
    public String content;

    public abstract void sendNotification(Person person);
}
