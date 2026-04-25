public class Main {

    public static void main(String[] args) {

        StockExchange exchange = new StockExchange();
        StocksManager manager = new StocksManager();


        Investor investor1 = new Investor("Олександр");
        Investor investor2 = new Investor("Марія");
        Investor investor3 = new Investor("Василь");
        Investor investor4 = new Investor("Катерина");


        Broker broker = new Broker("ТрейдМакс");


        System.out.println("--- Реєстрація підписників ---");
        manager.subscribe("Apple", investor1);
        manager.subscribe("Apple", investor2);
        manager.subscribe("Apple", broker);   

        manager.subscribe("Google", investor3);
        manager.subscribe("Google", investor4);
        manager.subscribe("Google", broker);  


        manager.notifySubscribers("Apple", 4500.00);
        manager.notifySubscribers("Google", 9200.50);


        System.out.println("\n--- Марія відписалась від Apple ---");
        manager.unsubscribe("Apple", investor2);

        manager.notifySubscribers("Apple", 4750.00);
    }
}
