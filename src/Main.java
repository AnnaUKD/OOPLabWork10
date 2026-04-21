public class Main {

    public static void main(String[] args) {


        StockExchange exchange = new StockExchange();


        Investor investor1 = new Investor("Олександр");
        Investor investor2 = new Investor("Марія");
        Broker broker = new Broker("ТрейдМакс");


        exchange.attach(investor1);
        exchange.attach(investor2);
        exchange.attach(broker);


        exchange.setStockPrice("Apple", 4500.00);
        exchange.setStockPrice("Google", 9200.50);


        System.out.println("\nМарія відписалась від біржі");
        exchange.detach(investor2);


        exchange.setStockPrice("Microsoft", 8100.75);
    }
}