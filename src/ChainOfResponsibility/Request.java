package ChainOfResponsibility;

public class Request {
    private double price;
    private int id;

    public Request(double price, int id) {
        this.price = price;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
