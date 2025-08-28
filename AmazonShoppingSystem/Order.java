package AmazonShoppingSystem;

import MovieTicketBooking.Payment;

import java.util.Date;

public class Order {

    private String orderNumber;
    private AuthenticatedUser user;
    private Date orderedDate;
    private OrderStatus orderStatus;
    private ShoppingCart shoppingCart;

    public Order(String orderNUmber, OrderStatus orderStatus ) {
        this.orderNumber = orderNumber;
        this.orderedDate = new Date();
        this.orderStatus = orderStatus;
    }

    public boolean sendForShipment() {
        return true;
    }

    public PaymentStatus makePayment() {
        return PaymentStatus.CONFIRMED;
    }

    public boolean verify(CartItems item) {
        return true;
    }

}
