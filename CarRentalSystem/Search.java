package CarRentalSystem;

import java.util.List;

public interface Search {

     List<Vehicle> searchByType(String type);
     List<Vehicle> searchByModel(String model);

}
