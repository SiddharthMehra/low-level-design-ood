package MeetingScheduler;

import java.util.List;

public class MeetingScheduler {

    private User organizer;
    private Calendar calendar;
    private List<MeetingRoom> meetingRooms;

    public MeetingScheduler(User organizer, List<MeetingRoom> meetingRooms) {}

    public Meeting scheduleMeeting(List<User> users, Interval interval, String subject) {
        return null;
    }

    public boolean cancelMeeting(Meeting meeting) {
        return true;
    }

    public MeetingRoom checkAvailability(int capacity, Interval interval) {
        return null;
    }

    public boolean bookRoom(Interval interval, Meeting meetingRoom) {
        return true;
    }

    public boolean releaseRoom(Interval interval, Meeting meetingRoom) {
        return true;
    }

}
