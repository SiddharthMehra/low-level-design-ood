package AmazonShoppingSystem;

import java.util.Date;

public abstract class Payment {

    private double amount;
    private int paymentId;
    private Date paymentDate;
    private PaymentStatus paymentStatus;

    public abstract PaymentStatus makePayment();
}
