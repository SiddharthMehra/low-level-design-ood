package MovieTicketBooking;

public class CreditCardPayment extends Payment {

    @Override
    public boolean makePayment() {
        return true;
    }
}
