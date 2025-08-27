package CarRentalSystem;

public abstract class Account extends Person{

    private String accountId;
    private String password;
    private AccountStatus accountStatus;

    public Account () {}

    public abstract  boolean resetPassword();
}
