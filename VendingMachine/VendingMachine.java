package VendingMachine;

public class VendingMachine {

    private final State noMoneyState = new NoMoneyInsertedState();
    private final State moneyinsertedState = new MoneyInsertedState();
    private final State dispenseState = new DispenseState();

    private State currentState = noMoneyState;
    private double currentAmount = 0.0;
    private int selectedRack = -1;
    private final Inventory inventory = new Inventory();

    private static VendingMachine instance;
    private VendingMachine() {}

    public static VendingMachine getInstance() {
        if (instance == null) {
            instance = new VendingMachine();
        }
        return instance;
    }

    State getNoMoneyState() {
        return noMoneyState;
    }

    State getMoneyinsertedState() {
        return moneyinsertedState;
    }

    State getDispenseState() {
        return dispenseState;
    }

    void setState(State state) {
        this.currentState = state;
    }

    double getCurrentAmount() {return currentAmount;}
    void addToCurrentAmount(double amt) {}
    Inventory getInventory(){ return inventory;}

    void setSelectedRack(int rack) {}

    public void insertMoney(double amt) {
        currentState.insertMoney(this, amt);
    }

    public void setProduct(int rackNumber) {
        currentState.selectProduct(this, rackNumber);
    }

    public void dispenseProduct() {}
    public void refund() {}
    public void addRack(Rack rack) {}
    public void loadProduct(int rackNumber, Product product, int quantity) {

    }
    public void showInventory() {}
}
