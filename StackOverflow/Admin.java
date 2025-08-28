package StackOverflow;

public class Admin extends User {
    public boolean blockUser(User user) {
        return true;
    }

    public boolean unblockUser(User user) {
        return true;
    }

    public void awardBadge(User user, Badge badge) {

    }
}