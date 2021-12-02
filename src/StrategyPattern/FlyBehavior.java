package StrategyPattern;

public interface FlyBehavior {
    public void fly();
}

class GoodFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞翔技术高超");
    }
}
class NormalFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞翔技术一般");
    }
}
class NoFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}