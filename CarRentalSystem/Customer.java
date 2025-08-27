package CarRentalSystem;

import java.util.Date;
import java.util.UUID;

public class Customer extends Account{

    private String licenseNo;
    private Date licenseExpiry;

    @Override
    public boolean resetPassword() {
        return true;
    }
}
