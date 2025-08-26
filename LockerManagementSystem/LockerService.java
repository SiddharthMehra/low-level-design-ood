package LockerManagementSystem;

import java.util.List;

public class LockerService {

    private List<Locker> locations;

    private static LockerService lockerService = null;

    public static LockerService getInstance() {
        if (lockerService == null) {
            lockerService = new LockerService();
        }
        return lockerService;
    }

    public void addLocation(LockerLocation loc) {}
    public Locker findLockerById(String lockerId) {
        return null;
    }

    public boolean requestLocker() {
        return true;
    }

    public boolean requestReturn(Order order) {
        return true;
    }

    public boolean verifyOtp(LockerPackage lockerPackage, String code) {
        return true;
    }

}
