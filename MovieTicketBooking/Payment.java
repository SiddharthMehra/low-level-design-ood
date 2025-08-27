package MovieTicketBooking;

import java.util.Date;

public abstract class Payment {

    public double amount;
    public Date timestamp;
    public PaymentStatus paymentStatus;

    public abstract boolean makePayment();
}
