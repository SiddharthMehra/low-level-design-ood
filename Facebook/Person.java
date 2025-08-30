package Facebook;

public abstract class Person {

    private String id;
    private String password;
    private String email;
    private String name;
    private Address address;
    private String phone;
    private AccountStatus accountStatus;

    public abstract boolean resetPassword();
}
