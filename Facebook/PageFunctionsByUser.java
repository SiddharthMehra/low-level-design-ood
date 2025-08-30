package Facebook;

public interface PageFunctionsByUser {

    public Page createPage(String name);

    public Page sharePage(Page page ) ;

    public abstract void likePage(Page page);
    public abstract void unlikePage(Page page);
    public abstract void followPage(Page page);
    public abstract void unfollowPage(Page page);

}
