package CarRentalSystem;

public class CreditCard extends Payment{

    private String name;
    private String cardNo;
    private String billingAddress;
    private int code;

    @Override
    public boolean makePayment() {
        return true;
    }
}
