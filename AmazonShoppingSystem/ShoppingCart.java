package AmazonShoppingSystem;

public class ShoppingCart {

    private int totalPrice;
    private List<Item> itemList;

    public boolean addItem(Item item) {
        return true;
    }

    public boolean deleteItem(Item item) {
        return true;
    }

    public List<Item> getItems() {
        return null;
    }

    public boolean checkout() {
        return true;
    }

    public boolean verify() {
        return true;
    }

    public double getTotalPrice() {
        return 0;
    }
}
