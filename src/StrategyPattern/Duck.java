package StrategyPattern;

public abstract class Duck {
    //属性（策略）接口
    protected FlyBehavior flyBehavior;
    protected RoarBehavior roarBehavior;
    protected SurfBehavior surfBehavior;

    public Duck(){}

    public abstract void display();     //显示信息

    public void roar(){
        System.out.println("鸭子使用了叫声");
        if(roarBehavior != null){
            roarBehavior.roar();
        }
    }

    public void surf(){
        System.out.println("鸭子使用了冲浪");
        if(surfBehavior != null){
            surfBehavior.surf();
        }
    }

    public void fly(){
        System.out.println("鸭子使用了飞翔");
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }
}
