package CarRentalSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleReservation {

    private int reservationId;
    private int customerId;
    private String vehicleId;
    private Date creationdate;
    private ReservationStatus status;
    private Date dueDate;
    private Date returnDate;
    private String pickupLocation;
    private String returnLocation;
    private List<Equipment> equipments = new ArrayList<>();
    private List<Service> services = new ArrayList<>();
}
