import java.util.*;

class ParkingLot {
    private int id;
    private String name;
    private Address address;
    private ParkingRate parkingRate;

    private Map<String, Entrance> entrances;
    private Map<String, Exit> exits;
    private Map<String, ParkingSpot> parkingSpots;
    private Map<String, ParkingTicket> parkingTickets;
    private List<DisplayBoard> displayBoards;
}
