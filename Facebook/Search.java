package Facebook;

import java.util.List;

public interface Search {

    public List<User> searchUsers(String name);

    public List<Group> searchGroups(String name);

    public List<Post> searchPosts(String name);

    public List<Page> searchPages(String name);
}
