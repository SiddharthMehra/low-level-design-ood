package AmazonShoppingSystem;

import CarRentalSystem.CreditCard;
import VendingMachine.Product;

import java.util.List;

public class Account {

    private String userName;
    private String password;
    private String name;
    private List<Address> shippingAddress;

    private AccountStatus accountStatus;
    private String phone;
    private String email;

    private List<CreditCard> creditCards;
    private List<ElectronicBankTransfer> bankAccounts;

    public Address getShippingAddress();

    public boolean addProduct(Product product);

    public boolean addProductReview(ProductReview review, Product product);
    public boolean deleteProduct(Product product)
        public boolean deleteProductReview(ProductReview review, Product product);

    public boolean resetPassword() {
        return true;
    }
}
