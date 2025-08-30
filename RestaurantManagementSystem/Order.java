package RestaurantManagementSystem;

import java.util.Date;

public class Order {

    private int orderId;
    private OrderStatus orderStatus;
    private Date creationTime;
    private Meal[] meals;
    private Waiter waiter;
    private Table table;

    public boolean addMeal(Meal meal) {
        return true;
    }

    public boolean removeMeal(Meal meal) {
        return true;
    }

    public boolean replaceMealItem(Meal oldItem, Meal  newItem) {
        return true;
    }

}
