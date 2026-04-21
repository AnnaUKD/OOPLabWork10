public class Broker implements Observer {

    private String name;

    public Broker(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("Брокер " + name + " отримав повідомлення: акція " + stockName + " змінила ціну на " + newPrice);
    }
}