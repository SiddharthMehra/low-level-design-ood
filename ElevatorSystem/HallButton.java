package ElevatorSystem;

import ElevatorSystem.enums.Direction;

public class HallButton extends Button {

    private final Direction direction;
    public HallButton(Direction dir) {
        this.direction = dir;
    }

    public Direction getDirection() {return null;}

    @Override
    public boolean isPressed() {
        return pressed;
    }
}
