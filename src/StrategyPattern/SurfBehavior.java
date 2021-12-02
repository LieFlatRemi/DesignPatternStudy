package StrategyPattern;

public interface SurfBehavior {
    public void surf();
}
class GoodSurf implements SurfBehavior{
    @Override
    public void surf() {
        System.out.println("冲浪技术高超");
    }
}

class NoSurf implements SurfBehavior{
    @Override
    public void surf() {
        System.out.println("无法学会冲浪！");
    }
}

