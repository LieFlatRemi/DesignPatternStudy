package StrategyPattern;

public class PsyDuck extends Duck{
    public PsyDuck(){
        flyBehavior = new NoFly();
        surfBehavior = new NoSurf();
        roarBehavior = new BadRoar();
    }

    @Override
    public void display() {
        System.out.println("俺是可达鸭");
    }

}
