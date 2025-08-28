package StackOverflow;

public abstract class User {

    private int reputationPoints;
    private String userName;
    private List<Badge> badges;
    private Question currentDraft;

    public void create(String title, String body, List<Tag> tags) {}

    public boolean addAnswer(Question Question, Answer answer) {
        return true;
    }

    public boolean createComment(Comment comment) {
        return true;
    }

    public boolean createTag(Tag tag) {}

    public void flagQuestion(Question question) {}

    public void flagAnswer(Answer answer) {}

    public void upVote() {int id;}

    public void downVote() {int id;}

    public void acceptAnswer() {}

    public void voteToCloseQuestion(Question question) {}

    public void publishQuestion(Question question) {}

    public void addBounty(int value) {}
}
