package Decorator;

public class Chocolate extends Decoration{
    public Chocolate(Drink drink){
        super(drink);
        this.setPrice(3.0);
        this.setDes("巧克力");
    }
}
