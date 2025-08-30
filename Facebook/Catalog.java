package Facebook;

import java.util.HashMap;
import java.util.List;

public class Catalog implements Search{

    HashMap<String, List<User>>  userNames;
    HashMap<String, List<Post>> posts;
    HashMap<String, List<Group>> groups;
    HashMap<String, List<Page>> pages;

    public List<User> searchUsers(String name) {
        return null;
    }

    public List<Page> searchPages(String name) {
        return null;
    }

    public List<Group> searchGroups(String name) {
        return null;
    }

    public List<Post> searchPosts(String name) {
        return null;
    }
}
