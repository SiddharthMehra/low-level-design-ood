package MovieTicketBooking;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    public int cinemaId;

    public List<Hall> cinemaHalls = new ArrayList<>();

    public City city;

    public Cinema(int cinemaId, List<Hall> cinemaHalls, City city) {
        this.cinemaId = cinemaId;
        this.cinemaHalls = cinemaHalls;
        this.city = city;
    }
}
