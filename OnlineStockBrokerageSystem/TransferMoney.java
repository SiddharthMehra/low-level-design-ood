package OnlineStockBrokerageSystem;

import java.util.Date;

public abstract class TransferMoney {

    private int id;
    private Date creationDate;
    public int fromAccount;
    public int toAccount;

    public abstract boolean initiateTransaction();
}
