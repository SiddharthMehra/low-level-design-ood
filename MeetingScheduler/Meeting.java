package MeetingScheduler;

import java.util.List;
import java.util.Map;

public class Meeting {

    private int id;
    private Map<User, RSVPStatus> participantStatus;
    private MeetingRoom meetingRoom;
    private Interval interval;
    private String subject;

    public Meeting(int id, List<User> participants, Interval interval, Meeting meeting
    , String subject) {}

    public void addParticipant(List<User> participants) {}
    public void updateParticipantStatus(User user, RSVPStatus status) {}

    public List<User> getAcceptedParticipants() {
        return null;
    }
    public List<User> getPendingParticipants() {
        return null;
    };
    public List<User> getDeclinedParticipants() {
        return null;
    }
}
