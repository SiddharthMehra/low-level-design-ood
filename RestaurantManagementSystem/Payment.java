package RestaurantManagementSystem;

import java.util.Date;

public abstract class Payment {

    private int paymentId;
    private Date creationDate;
    private PaymentStatus paymentStatus;
    private double amount;

    public abstract void processPayment();
    public abstract void updateTableStatus(Table table);
}
