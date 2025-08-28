package HotelManagementSystem;

import java.util.List;

public class Room {

    private String roomNumber;
    private RoomStyle style;
    private RoomStatus status;
    private double bookingPrice;
    private boolean isSmoking;
    private List<RoomKey> keys;
    private List<RoomHousekeeping> housekeepingLog;

    public boolean isRoomAvailable() {
        return true;
    }

    public boolean checkIn() {
        return true;
    }

    public boolean checkOut() {
        return true;
    }
}
