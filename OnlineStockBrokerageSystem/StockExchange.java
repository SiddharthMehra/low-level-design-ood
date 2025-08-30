package OnlineStockBrokerageSystem;

public class StockExchange {

    private static StockExchange stockExchange = null;

    private StockExchange() {}

    public static StockExchange getInstance() {
        return null;
    }
    public boolean placeOrder(Order order) {
        return true;
    }

    public boolean acknowledge(Order order) {
        return true;
    }
}
