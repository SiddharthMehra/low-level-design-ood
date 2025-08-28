package AmazonShoppingSystem;

import java.util.HashMap;
import java.util.List;

public class Catalog extends Search {

    public HashMap<String, List<Product>> searchByName= new HashMap<>();
    public HashMap<String, List<Product>> searchByCategory= new HashMap<>();

    public List<Product> searchByName(String name) {
        return null;
    }

    public List<Product> searchByCategory(String category) {
        return null;
    }

    public Product getProductDetails(Product product) {
        return null;
    }

}
