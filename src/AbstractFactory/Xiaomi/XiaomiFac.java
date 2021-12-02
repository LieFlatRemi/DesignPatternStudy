package AbstractFactory.Xiaomi;

import AbstractFactory.AbstractFac.PhoneProduct;
import AbstractFactory.AbstractFac.ProductFactory;
import AbstractFactory.AbstractFac.RouteProduct;

public class XiaomiFac implements ProductFactory {
    @Override
    public PhoneProduct createPhone() {
        return new XiaomiPhone();
    }

    @Override
    public RouteProduct createRoute() {
        return new XiaomiRoute();
    }
}
