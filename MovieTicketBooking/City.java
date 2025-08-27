package MovieTicketBooking;

import java.util.ArrayList;
import java.util.List;

public class City {

    public String name;
    public String state;
    public String country;
    public String zipCode;

    public List<Cinema> cinemas = new ArrayList<>();

    public City(String name, String state, String country, String zipCode) {
        this.name = name;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        this.cinemas = cinemas;
    }


}
