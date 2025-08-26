package ElevatorSystem;

import ElevatorSystem.enums.Direction;

import java.util.List;

public class ElevatorSystem {

    private static ElevatorSystem elevatorSystem;
    private final Building building;

    private ElevatorSystem(int numFloors, int cars, Building building) {
        this.building = building;
    }

    public List<ElevatorCar> getElevatorCars() {
        return null;
    }

    public Building getBuilding() {
        return null;
    }

    public void callElevator(int numFloor, Direction dir) {}

    public ElevatorCar getNearestCar(int floor) {
        return null;
    }

    public void dispatches() {}
    public void monitoring() {}


    public static ElevatorSystem getInstance(int floors, int cars) {
        return null;
    }
}
