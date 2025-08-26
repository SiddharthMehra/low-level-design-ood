package ElevatorSystem;

import java.util.List;

public class Floor {

    private final int floorNumber;

    private final List<HallPanel> hallPanelList;

    private final Display display;

    public Floor(int floor, List<HallPanel> hallPanelList, Display display) {
        this.floorNumber = floor;
        this.hallPanelList = hallPanelList;
        this.display = display;
    }

    public int getFloorNumber(){ return 0;}

    public List<HallPanel> getHallPanelList() {
        return null;
    }

    public HallPanel getPanel(int index) {
        return null;
    }

    public Display getDisplay() {
        return null;
    }
}
