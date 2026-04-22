import java.util.ArrayList;
import java.util.List;

public class StocksManager {
    private List<StockExchange> stocks = new ArrayList<>();
    private List<Observer> followers = new ArrayList<>();

    public void addStock(StockExchange stock) {
        stocks.add(stock);
    }

    public void removeStock(StockExchange stock) {
        stocks.remove(stock);
    }


    public void addStockFollower(StockExchange stockName, Observer observer) {
        followers.add(observer);
    }


    public void removeStockFollower(Observer observer) {
        followers.remove(observer);
    }

}
