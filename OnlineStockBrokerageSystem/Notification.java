package OnlineStockBrokerageSystem;

import java.util.Date;

public abstract class Notification {

    private String notificationId;
    private Date creationDate;
    private String content;

    public abstract boolean sendNotification();
}
