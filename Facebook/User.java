package Facebook;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class User extends Person implements PageFunctionsByUser{

    private Date dateOfJoining;
    private List<Page> pagesAdmin;
    private List<Group> groupsAdmin;
    private Profile profile;

    private Set<Role> roles = new HashSet<>();

    public boolean hasRole(Role role) {
        return true;
    }

    public boolean sendMessage(Message message) {
        return true;
    }

    public boolean sendRecommendation(Page page, Group group, User user) {
        return true;
    }

    public boolean sendFriendRequest(User user) {
        return true;
    }

    public boolean unFriendUser(User user) {
        return true;
    }

    public boolean blockUser(User user) {
        return true;
    }

    public boolean followUser(User user) {
        return true;
    }

    public Page createPage(String name) {
        return null;
    }
    public void likePage(Page page) {}

    @Override
    public void unlikePage(Page page) {

    }

    public void followPage(Page page) {}

    @Override
    public void unfollowPage(Page page) {

    }

    public void unLikePage(Page page) {}
    public void unFollowPage(Page page) {}
    public Page sharePage(Page page) {
        return null;
    }
    public List<User> search(String name) {
        return null;
    }
    public boolean addFriend(User userB) {
        return true;
    }
    public boolean accept(FriendRequest request) {
        return true;
    }
    public boolean reject(FriendRequest request) {
        return true;
    }
    public void enablePage(Page page) {}
    public void disablePage(Page page) {}

    // If user is Admin
    public void blockPageUser(User user) {}
    public void unblockPageUser(User user) {}
    public void blockGroupUser(User user) {}
    public void unblockGroupUser(User user) {}
    public void changeGroupPrivacy(Group group) {}

    @Override
    public boolean resetPassword() {
        return false;
    }
}
