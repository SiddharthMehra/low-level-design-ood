package AtmSystem;

public class Atm {

    private static Atm atm = new Atm;
    private AtmState atmState;
    private AtmStatus status;
    private int amtBalance;
    private int numHundredDollarBills;
    private int numFiftyDollarBills;
    private int numTenDollarBills;

    private CardReader reader;
    private CashDispenser cashDispenser;
    private Keypad keypad;
    private Printer printer;
    private Screen screen;

    private Atm() {}

    private Atm getInstance() {
        return atm;
    }

    public void displayCurrentState() {
        System.out.println("atm status" + status);
    }

    public void initialiseAtm(int amtBalance, int numHundredDollarBills, int numFiftyDollarBills, int numTenDollarBills)
}
