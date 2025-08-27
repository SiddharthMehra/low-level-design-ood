package MeetingScheduler;

import java.util.Date;

public class Notification {

    private int notificationId;
    private String content;
    private Date creationDate;

    public Notification(int notificationId, String content, Date creationDate) {}

    public void sendInvite(User user, Meeting meeting) {}
    public void cancelNotification(User user, Meeting meeting) {}
}
