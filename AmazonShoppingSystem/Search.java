package AmazonShoppingSystem;

import java.util.List;

public interface Search {

    public abstract List<Product> searchByName(String name);
    public abstract List<Product> searchByCategory(String category);
    public abstract Product getProductDetails(Product product);
}
