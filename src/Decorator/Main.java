package Decorator;

public class Main {
    public static void main(String[] args) {
        Drink order = new BlackCoffee(20.0);

        //加入一份牛奶（包装一次）
        order = new Milk(order);
        System.out.println("加入牛奶后：");
        System.out.println(order.getDes());
        System.out.println(order.getCost());

        //加入第二份牛奶
        order = new Milk(order);
        System.out.println(order.getDes());
        System.out.println(order.getCost());

        //加入一份巧克力
        order = new Chocolate(order);
        System.out.println(order.getDes());
        System.out.println(order.getCost());
    }
}
