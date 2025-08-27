package CarRentalSystem;

public class Address {

    private String streetAddress;
    private String zipCode;
    private String city;
    private String state;
    private String country;

    public Address(String streetAddress, String zipCode, String city, String state, String country) {
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
