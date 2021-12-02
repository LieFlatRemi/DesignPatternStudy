package Decorator;

public class Coffee extends Drink {
    @Override
    public double getCost() {
        return getPrice();
    }
}
