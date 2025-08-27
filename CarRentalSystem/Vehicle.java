package CarRentalSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Vehicle {

    private String vehicleId;
    private String licenseNo;
    private int passengerCapacity;
    private VehicleStatus vehicleStatus;
    private String model;
    private Date manufacturingYear;
    private List<Vehicle> log = new ArrayList<>();


}
