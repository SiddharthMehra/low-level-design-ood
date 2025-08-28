package StackOverflow;

import java.util.HashMap;
import java.util.List;

public class Catalog implements Search{

    public HashMap<Tag, List<Question>> questionUsingTags = new HashMap<>();
    public HashMap<User, List<Question>> questionUsingUsers = new HashMap<>();
    public HashMap<String, List<Question>> questionUsingWords = new HashMap<>();

    public List<Question> searchByTags(String tag) {
        return null;
    }

    public List<Question> searchByUsers(User user) {
        return null;
    }

    public List<Question> searchByWords(String word) {
        return null;
    }


}
