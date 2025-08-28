package HotelManagementSystem;

public abstract class Account {

    private String id;
    private String password;
    private AccountStatus accountStatus;

    public abstract boolean resetPassword();
}
