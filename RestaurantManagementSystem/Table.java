package RestaurantManagementSystem;

import java.util.Date;
import java.util.List;

public class Table {

    private int tableId;
    private TableStatus tableStatus;
    private int locationId;
    private int capacity;
    private int numberOfSeats;

    public boolean isTableFree() {
        return true;
    }

    public boolean addReservation() {
        return true;
    }

    public static List<Table> search(int capacity, Date time) {
        return null;
    }
}
