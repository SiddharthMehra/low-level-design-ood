package Blackjack;

public class BlackjackPlayer extends Player {

    public BlackjackPlayer(String id, String password, double balance, Person person) {
        super(id, password, balance, person);
    }

    @Override
    public boolean resetPassword() {
        return true;
    }

    public void placeBet(double amt) {}
    public void getBet() {}
    public void setPayout(double multiplier) { }
}
