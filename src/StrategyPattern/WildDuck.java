package StrategyPattern;

public class WildDuck extends Duck{
    public WildDuck(){
        flyBehavior = new GoodFly();        //野鸭很会飞
        surfBehavior = new GoodSurf();
        roarBehavior = new GoodRoar();
    }

    @Override
    public void display() {
        System.out.println("我是野鸭");
    }
}
