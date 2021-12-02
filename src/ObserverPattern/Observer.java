package ObserverPattern;

//观察接口
public interface Observer {
    public void update(double temperature, double pressure, double humidity);
}
