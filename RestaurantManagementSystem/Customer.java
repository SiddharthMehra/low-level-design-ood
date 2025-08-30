package RestaurantManagementSystem;

public class Customer extends Person{

    public List<Table> searchAvailableTables() {
        return null;
    }

    public boolean makeReservation() {
        return true;
    }

    public Order placeOrder() {
        return null;
    }

    public boolean cancelReservation() {
        return true;
    }

    public boolean payBill() {
        return true;
    }

    public Bill requestBillDetails() {
        return null;
    }
}
