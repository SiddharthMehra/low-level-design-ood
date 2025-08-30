package Facebook;

import java.util.List;

public class Message {

    private int messageId;
    private String content;
    private User sender;
    private List<User> recipient;
    private List<byte[]> multimedia;

    public boolean addRecipient(List<User> users) {
        return true;
    }
}
