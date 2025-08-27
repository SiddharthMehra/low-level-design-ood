package ElevatorSystem;

import java.util.List;

public class Building {

    private final List<Floor> floors;

    private final List<ElevatorCar> elevatorCars;

    private final int numPanels;
    private final int numDisplaysPerFloor;

    public Building(List<Floor> floors, List<ElevatorCar> cars,int numPanels, int numDisplaysPerFloor) {
        this.floors = floors;
        this.elevatorCars = cars;
        this.numPanels = numPanels;
        this.numDisplaysPerFloor = numDisplaysPerFloor;
    }

    public List<Floor> getFloors () {
        return floors;
    }

    public List<ElevatorCar> getElevatorCars() {
        return elevatorCars;
    }
        public int getNumPanels () {
            return numPanels;
        }
        public int getNumDisplaysPerFloor() {
            return numDisplaysPerFloor;
        }
}
