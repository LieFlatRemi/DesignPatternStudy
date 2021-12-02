package Singleton;


//饿汉式
public class SingletonHunger {
    private static SingletonHunger singleton = new SingletonHunger();
    private SingletonHunger(){
        System.out.println("饿汉式生成实例");
    }
    public static SingletonHunger getInstance(){
        return singleton;
    }
}
