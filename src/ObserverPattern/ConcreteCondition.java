package ObserverPattern;


//气象站，相当于Observer
public class ConcreteCondition implements Observer{
    private double temperature;     //温度
    private double pressure;        //气压
    private double humidity;        //湿度

    public void display() {
        System.out.println("温度：" + this.temperature);
        System.out.println("气压：" + this.pressure);
        System.out.println("湿度：" + this.humidity);
    }

    @Override
    public void update(double temperature, double pressure, double humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
