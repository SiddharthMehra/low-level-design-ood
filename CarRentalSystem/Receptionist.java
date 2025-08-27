package CarRentalSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Receptionist extends Account{

    private Date dateJoined;
    private List<Customer> customerList = new ArrayList<>();

    @Override
    public boolean resetPassword() {
        return true;
    }
}
