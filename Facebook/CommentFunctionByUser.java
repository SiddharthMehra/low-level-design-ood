package Facebook;

public interface CommentFunctionByUser {

    public abstract Comment createComment(Post post, String content);
    public abstract void likeComment(Comment comment);
}
