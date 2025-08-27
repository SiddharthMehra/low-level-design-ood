package AtmSystem;

public class SavingAccount extends BankAccount{

    @Override
    public double getWithdrawlLimit() {
        return 0.0;
    }
}
