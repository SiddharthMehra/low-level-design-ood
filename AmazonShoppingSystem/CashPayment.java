package AmazonShoppingSystem;

public class CashPayment extends Payment{

    private double amount;

    public PaymentStatus makePayment() {
        return PaymentStatus.CONFIRMED;
    }
}
