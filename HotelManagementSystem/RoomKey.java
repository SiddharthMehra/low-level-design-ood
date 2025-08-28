package HotelManagementSystem;

import java.util.Date;

public class RoomKey {

    private String roomKeyId;
    private String barCode;
    private Date issuedAt;
    private boolean isMaster;
    private boolean isActive;

    public boolean assignRoom() {
        return true;
    }

}
