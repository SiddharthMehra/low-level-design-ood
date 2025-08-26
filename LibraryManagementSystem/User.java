package LibraryManagementSystem;

public abstract class User {

    private String id;
    private String password;
    private AccountStatus accountStatus;
    private Person person;
    private LibraryCard libraryCard;

    public abstract boolean resetPassword();
    }
}
