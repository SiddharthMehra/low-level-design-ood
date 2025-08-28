package StackOverflow;

import java.util.List;

public interface Search {

    List<Question> searchByTags(String tagName);
    List<Question> searchByUsers(User user);
    List<Question> searchByWords(String word);

}
