package ObserverPattern;

public class WeatherData extends Subject {
    private double temperature;     //温度
    private double pressure;        //气压
    private double humidity;        //湿度

    public void setData(double temperature, double pressure, double humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //通知所有观察者更新数据
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        //遍历所有的观察者并通知
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).update(this.temperature, this.pressure, this.humidity);
        }
    }
}
