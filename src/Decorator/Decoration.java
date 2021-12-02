package Decorator;

public class Decoration extends Drink {
    private Drink drink;

    public Decoration(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double getCost() {
        return drink.getCost() + super.getPrice();
    }

    @Override
    public String getDes() {
        return des + "->" + drink.getDes();
    }
}
