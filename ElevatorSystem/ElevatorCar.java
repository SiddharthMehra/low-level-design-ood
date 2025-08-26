package ElevatorSystem;

import ElevatorSystem.enums.ElevatorState;

import java.util.Queue;

public class ElevatorCar {

    private final int id;
    private int currentFloor;
    private ElevatorState elevatorState;

    public ElevatorCar(int elevatorId, ElevatorPanel elevatorPanel, Queue<Integer> requestQueue) {
        this.id = elevatorId;
        this.elevatorPanel = elevatorPanel;
        this.requestQueue = requestQueue;
    }

    private final Door door = new Door();
    private final Display display = new Display();
    private final ElevatorPanel elevatorPanel;
    private final Queue<Integer> requestQueue;
    private int load;
    private boolean overloaded;
    private boolean maintenance;

    public int getId() { return 0;}

    public int getCurrentFloor() {
        return 0;
    }

    public ElevatorState getState() {
        return null;
    }

    public ElevatorPanel getElevatorPanel() {
        return null;
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isOverloaded() {
        return false;
    }

    public void registerRequest(int floor) {}

    public void move() {}

    public void enterMaintenance() {}
    public void exitMaintenance() {}

    public void emergencyStop() {}
    public void addLoad(int kg) {}
    public void removeLoad(int kg) {}

    public  Display  getCurrentDisplay() {return null;}

    public Door getDoor() {return null;}

}
