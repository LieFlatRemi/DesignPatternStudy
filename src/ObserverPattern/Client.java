package ObserverPattern;

public class Client {
    public static void main(String[] args) {
        //数据中心
        WeatherData wd = new WeatherData();
        //观察者
        Observer ob1 = new ConcreteCondition();
        Observer ob2 = new ConcreteCondition();
        //添加观察者
        wd.attach(ob1);
        wd.attach(ob2);
        wd.setData(10.0,100.0,30.3);
        System.out.println("--------------------");
        wd.setData(20.0, 200.0,40.5);
    }
}
