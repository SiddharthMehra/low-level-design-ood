package StackOverflow;

import java.util.Date;
import java.util.List;

public class Question {

    private int id;
    private String title;
    private String content;
    private User createdBy;
    private QuestionStatus questionStatus;
    private int upvotes;
    private int downvotes;
    private int votecount;
    private Date creationDate;
    private Date modificationDate;
    private Bounty bounty;

    private List<Tag> tags;
    private List<Comment> comments;
    private List<User> followers;
    private List<Asnwer> answers;

    public void addComment(Comment comment) {}
    public void addBounty(Bounty bounty) {}
    public void notify(String closedQuestion) {}
    public void createBounty(int value) {}
}
