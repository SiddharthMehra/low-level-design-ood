package AmazonShoppingSystem;

import java.util.Date;

public abstract class Notification {

    private int notificationId;
    private Date createdOn;

    public abstract void sendNotification();

}
