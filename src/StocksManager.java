import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StocksManager {


    private Map<String, List<Observer>> subscribers = new HashMap<>();


    public void subscribe(String stockName, Observer observer) {
        if (!subscribers.containsKey(stockName)) {
            subscribers.put(stockName, new ArrayList<>());
        }
        subscribers.get(stockName).add(observer);
        System.out.println("Підписано на акцію " + stockName);
    }


    public void unsubscribe(String stockName, Observer observer) {
        if (subscribers.containsKey(stockName)) {
            subscribers.get(stockName).remove(observer);
            System.out.println("Відписано від акції " + stockName);
        }
    }


    public void notifySubscribers(String stockName, double newPrice) {
        System.out.println("\nЦіна акції " + stockName + " змінилась на " + newPrice);
        if (!subscribers.containsKey(stockName) || subscribers.get(stockName).isEmpty()) {
            System.out.println("Немає підписників на акцію " + stockName);
            return;
        }
        for (Observer o : subscribers.get(stockName)) {
            o.update(stockName, newPrice);
        }
    }
}