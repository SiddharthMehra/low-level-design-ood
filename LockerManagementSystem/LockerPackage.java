package LockerManagementSystem;

import java.util.Date;

public class LockerPackage extends Package{

    private int codeValidDays;
    private String lockerId;
    private String code;
    private Date packageDeliveryTime;
    private String deliveryPersonId;

    public LockerPackage(String packageId, double packageSize, Order order,
                         int codeValidDays, String lockerId, String code,
                         Date packageDeliveryTime, String deliveryPersonId) {
        super(packageId, packageSize, order);
    }

    public int getValidDays() {
        return codeValidDays;
    }

    public String getLockerId() {
        return lockerId;
    }

    public String getCode() {
        return code;
    }

    public Date getDate() {
        return packageDeliveryTime;
    }

    public String getDeliveryPerson() {
        return deliveryPersonId;
    }

    public boolean verifyCode(String code) {
        return true;
    }

}
