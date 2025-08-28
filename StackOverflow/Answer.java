package StackOverflow;

import java.util.Date;
import java.util.List;

public class Answer {

    private int id;
    private String content;
    private int flagCount;
    private int voteCount;
    private int upVotes;
    private int downVotes;
    private boolean isAccepted;
    private Date creationTime;
    private User postedBy;
    private List<Comment> comments;

    public void addComment(Comment comment) {}
}
