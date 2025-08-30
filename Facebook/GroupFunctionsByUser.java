package Facebook;

public interface GroupFunctionsByUser {

    public Group createGroup(String name);
    public abstract void joinGroup();
    public abstract void sendGroupInvite();
    public abstract void leaveGroup();
}
