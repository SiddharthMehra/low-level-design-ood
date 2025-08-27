package CarRentalSystem;

public class Cash extends Payment{

    @Override
    public boolean makePayment() {
       return true;
    }
}
