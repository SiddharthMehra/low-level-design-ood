package AmazonShoppingSystem;

import java.util.List;

public class Product {

    private String productId;
    private String name;
    private String description;
    private byte[] image;
    private double price;
    private ProductCategory category;
    private List<ProductReview> reviews;
    private int availableItemCount;
    private boolean updatePrice(double newPrice) {
        return true;
    }

}
