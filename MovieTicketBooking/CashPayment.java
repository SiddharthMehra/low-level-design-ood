package MovieTicketBooking;

public class CashPayment extends  Payment {

    @Override
    public boolean makePayment() {
        return true;
    }


}
