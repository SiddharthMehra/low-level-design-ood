package RestaurantManagementSystem;

import java.util.List;

public class Menu {

    private int menuId;
    private String title;
    private String description;
    private double price;
    private List<MenuSection> menuSection;

    public boolean addMenuSection(MenuSection menuSection) {
        return true;
    }
}
