package StrategyPattern;

public class PekingDuck extends Duck {
    public PekingDuck(){
        flyBehavior = new NoFly();      //不会飞
        roarBehavior = new GoodRoar();
        surfBehavior = new GoodSurf();
    }

    @Override
    public void display() {
        System.out.println("我是北京鸭");
    }
}
