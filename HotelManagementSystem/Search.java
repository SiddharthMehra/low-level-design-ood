package HotelManagementSystem;

import java.util.Date;
import java.util.List;

public interface Search {

    List<Room> search(RoomStyle style, Date date, int duration);
}
