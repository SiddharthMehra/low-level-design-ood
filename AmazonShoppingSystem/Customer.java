package AmazonShoppingSystem;

public abstract class Customer {

    private ShoppingCart shoppingCart;

    public abstract List<Product> searchProduct(String name);
}
