package HotelManagementSystem;

import java.util.Date;

public abstract class BillTransaction {

    private Date createdAt;
    private double amount;
    private PaymentStatus paymentStatus;

    public abstract void initiateTransaction();

}
