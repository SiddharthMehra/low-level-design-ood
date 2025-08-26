package ElevatorSystem;

public class ElevatorButton extends Button{

    private final int destinationFloor;
    public ElevatorButton(int floor) {
        this.destinationFloor = floor;
    }
    public int getDestinationFloor() {
        return 0;
    }

    @Override
    public boolean isPressed () {
        return pressed;
    }

}
