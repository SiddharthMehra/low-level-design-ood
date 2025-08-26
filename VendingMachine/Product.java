package VendingMachine;

public class Product {

    private final String name;
    private final int id;

    private final double price;
    private final ProductType productType;

    public Product(String name, int id, double price, ProductType productType) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.productType = productType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductType getProductType() {
        return productType;
    }

}
