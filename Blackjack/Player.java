package Blackjack;

public abstract class Player {

    protected String id;
    protected String password;
    protected double balance;
    protected AccountStatus accountStatus;
    protected Person person;
    protected Hand hand;

    public Player(String id, String password, double balance, Person person) {}

    public void setHand(Hand hand) {
    }

    public Hand getHand() {
            return null;
    }

    public double getBalance() {
            return 0;
    }

    public abstract boolean resetPassword();
}
