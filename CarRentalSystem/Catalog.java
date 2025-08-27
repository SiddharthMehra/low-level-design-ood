package CarRentalSystem;

import java.util.HashMap;
import java.util.List;

public class Catalog implements Search{

    private HashMap<String, List<Vehicle>> vehicleTypes = new HashMap<>();
    private HashMap<String, List<Vehicle>> vehicleModels = new HashMap<>();

    public List<Vehicle> searchByType(String type) {
        return null;
    }
    public List<Vehicle> searchByModel(String model) {
        return null;
    }
}
