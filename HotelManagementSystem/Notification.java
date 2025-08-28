package HotelManagementSystem;

import java.util.Date;

public abstract class Notification {

    private Date date;
    private String content;
    private int notificationId;

    public abstract boolean sendNotification(Person person);
}
