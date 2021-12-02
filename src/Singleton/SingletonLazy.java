package Singleton;

//懒汉式，不适用多线程并发
public class SingletonLazy {
    private static SingletonLazy singleton = null;
    private SingletonLazy(){
        System.out.println("懒汉式生成实例");
    }
    public static SingletonLazy getInstance(){
        if(singleton == null){
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}
