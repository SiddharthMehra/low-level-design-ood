package OnlineStockBrokerageSystem;

import java.util.Date;
import java.util.HashMap;

public abstract class Order {

    private String orderNumber;
    public  boolean isBuyOrder;
    private OrderStatus status;
    private EnforcementType enforcementType;
    private Date creationDate;
    private HashMap<Integer, OrderPart> parts;


}
