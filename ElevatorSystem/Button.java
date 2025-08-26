package ElevatorSystem;

public  abstract class Button {

    protected boolean pressed;
    public void pressDown() {}
    public void reset() {}
    public abstract boolean isPressed();
}

