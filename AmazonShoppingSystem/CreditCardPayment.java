package AmazonShoppingSystem;

import java.util.Date;

public class CreditCardPayment extends Payment{

    private int cardNumber;
    private Date expiryDate;
    private String name;
    private int securityCode;

    public PaymentStatus makePayment() {
        return PaymentStatus.CONFIRMED;
    }
}
