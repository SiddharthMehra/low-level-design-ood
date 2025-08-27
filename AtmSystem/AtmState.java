package AtmSystem;

public abstract class AtmState {

    public void insertCard(Atm atm, AtmCard card) {}
    public void authenticatePin(Atm atm, AtmCard card, String pin) {}
    public void selectOperation(Atm atm, TransactionType transactionType) {}
    public void cashWithdrawl(Atm atm, AtmCard card, double amount) {}
    public void displayBalance(Atm atm, AtmCard card) {}
    public void transferMoney(Atm atm, AtmCard card, BankAccount toAccount, double amount) {}
    public void changePin(Atm atm, AtmCard card, String pin) {}
    public void cancelTransaction(Atm atm) {}
    public void returnCard(Atm atm) {}
    public void exit(Atm atm) {}
}
