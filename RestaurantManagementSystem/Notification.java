package RestaurantManagementSystem;

import java.util.Date;

public abstract class Notification {

    private int notificationId;
    private Date createdAt;
    private String content;

    public abstract void sendNotification();

}
