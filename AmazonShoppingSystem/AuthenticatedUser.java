package AmazonShoppingSystem;

public class AuthenticatedUser {

    private Account account;
    private Order order;

    public OrderStatus placeOrder(Order order);
    public abstract List<Product> searchByProduct(String name);
    public ShoppingCart getCart();

    public List<Product> searchProduct(String name) {
        return null;
    }
}
