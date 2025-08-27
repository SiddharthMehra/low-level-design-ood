package CarRentalSystem;

import java.util.Date;

public abstract class Notification {

    private int notificationId;
    private Date createdOn;
    private String content;
    public void setContent(String c) {content = c;}

    public String getContent() {
        return "";
    }
    public abstract void sendNotification(Account account);
}
