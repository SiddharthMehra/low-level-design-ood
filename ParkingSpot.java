abstract class ParkingSpot {
    private int id;
    boolean isFree;
    private Vehicle vehicle;

    public abstract assignVehicle(Vehicle vehicle);

    public boolean removeVehicle(Vehicle vehicle) {
        return true;
    }
}

    class Handicapped extends ParkingSpot {
        public boolean assignVehicle(Vehicle vehicle) {
            return true;
        }
    }

    class Compact extends ParkingSpot {
        public boolean assignVehicle(Vehicle vehicle) {
            return true;
        }
    }

    class Large extends ParkingSpot {
        public boolean assignVehicle(Vehicle vehicle) {
            return true;
        }
    }

    class MotorcycleSpot extends ParkingSpot {
        public boolean assignVehicle(Vehicle vehicle) {
            return true;
        }
    }


}