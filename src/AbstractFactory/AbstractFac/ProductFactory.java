package AbstractFactory.AbstractFac;


//抽象工厂
public interface ProductFactory {
    public PhoneProduct createPhone();
    public RouteProduct createRoute();
}
