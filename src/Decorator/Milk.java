package Decorator;

public class Milk extends Decoration {
    public Milk(Drink drink) {
        super(drink);
        this.setPrice(5.0);
        this.setDes("牛奶");
    }
}
