package Facebook;

public interface PostFunctionsByUser {

    public abstract Post createPost(String content);
    public abstract Post sharePost(Post post);
    public abstract void commentOnPost(Post post);
    public abstract void likePost(Post post);
}
