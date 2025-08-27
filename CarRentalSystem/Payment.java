package CarRentalSystem;

import java.util.Date;

public abstract class Payment {

    private int paymentId;
    private Date timestamp;
    private int amount;
    private PaymentStatus paymentStatus;

    public abstract boolean makePayment();
}
