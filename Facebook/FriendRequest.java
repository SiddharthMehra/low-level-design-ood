package Facebook;

import java.util.Date;

public class FriendRequest {

    private User recipient;
    private User sender;
    private FriendRequestStatus status;
    private Date requestSent;
    private Date requestStatusModified;

    public boolean acceptRequest(User user) {
        return true;
    }

    public boolean rejectRequest(User user) {
        return true;
    }

    public boolean sendFriendRequest() {
        return true;
    }

    public boolean addToFriendList(User userB) {
        return true;
    }

    public boolean sendNotification() {
        return true;
    }

}
