package MeetingScheduler;

public class MeetingRoom {

    private int id;
    private String capacity;
    private Interval bookedIntervals;
    private boolean isAvailable;

    public MeetingRoom(int id, int capacity) {}

    public boolean isAvailable(Interval interval, int capacity) {
        return true;
    }

    public void bookInterval(Interval interval) {}
    public void releaseInterval(Interval interval) {}
}
