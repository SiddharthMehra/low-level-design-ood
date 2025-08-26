package VendingMachine;

public class NoMoneyInsertedState implements  State{

    @Override
    public void insertMoney(VendingMachine vm, double amount) {}

    @Override
    public void selectProduct(VendingMachine vm, int rack) {}
}
