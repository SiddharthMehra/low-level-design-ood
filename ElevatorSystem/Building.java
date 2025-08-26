package ElevatorSystem;

import java.util.List;

public class Building {

    private final List<Floor> floors;

    private final List<ElevatorCar> elevatorCars;

    public Building(List<Floor> numFloors, List<ElevatorCar> numCars, int numPanels, int numDisplaysPerFloor) {
        this.floors = numFloors;
        this.elevatorCars = numCars;
    }

    public List<Floor> getFloors () {
        return null;
    }

    public List<ElevatorCar> getElevatorCars() {
        return null;
    }

}
