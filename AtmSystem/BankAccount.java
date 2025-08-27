package AtmSystem;

public abstract class BankAccount {

    protected int accountNumber;
    protected double totalBalance;
    protected double availableBalance;

    public double getAvailableBalance() {
        return availableBalance;
    }

   public boolean withdraw(double amount) {
        if (amount<=availableBalance) {
            availableBalance-=amount;
            return true;
        }
        return false;
   }

   public boolean transfer(BankAccount toAccount, double amount) {
        if (amount<=availableBalance) {
            availableBalance-=amount;
            toAccount.availableBalance+=amount;
            return true;
        }
        return false;
   }

   public abstract double getWithdrawlLimit();
}

