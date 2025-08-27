package AtmSystem;

public class CurrentAccount extends BankAccount{

    @Override
    public double getWithdrawlLimit() {
        return 0.0;
    }
}
