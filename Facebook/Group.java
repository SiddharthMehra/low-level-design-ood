package Facebook;

import java.util.List;

public class Group implements GroupFunctions{

    private int groupId;
    private String name;
    private String description;
    private byte[] coverPhoto;
    private int totalUsers;
    private boolean isPrivate;
    private List<User> users;

    public boolean addUser(User user) {
        return true;
    }

    public boolean deleteUser(User user) {
        return true;
    }

    public void notifyUser(User user) {}

    public void updateDescription(String description) {}
    public void addCoverPhoto(byte[] image) {}

}
