package VendingMachine;

public class Rack {

    private final int rackNumber;
    private Product product;
    private int quantity;

    public Rack(int rackNumber) {
        this.rackNumber = rackNumber;
    }

    public int getRackNumber() {
        return rackNumber;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isEmpty() {
        return false;
    }

    public void loadProduct(Product product, int quantity) {}

    public Product peekProduct() {
        return null;
    }

    public void dispenseOne() {}

}
