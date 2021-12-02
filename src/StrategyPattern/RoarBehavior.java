package StrategyPattern;

public interface RoarBehavior {
    public void roar();
}

class GoodRoar implements RoarBehavior{
    @Override
    public void roar(){
        System.out.println("叫声巨大");
    }
}

class BadRoar implements RoarBehavior{
    @Override
    public void roar() {
        System.out.println("叫声难听的要死");
    }
}