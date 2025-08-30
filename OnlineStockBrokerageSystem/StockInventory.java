package OnlineStockBrokerageSystem;

import java.util.Date;

public class StockInventory implements Search {

    private String inventoryName;
    private Date lastDate;
    public Stock searchSymbol(String symbol) {
        return null;
    }

    public boolean deductStock(String symbol, double quantity) {
        return true;
    }

    public boolean sendOrderDetails(Order order) {
        return true;
    }

}
