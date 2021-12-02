package Decorator;

public abstract class Drink {
    protected String des;
    protected double price;

    public abstract double getCost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
