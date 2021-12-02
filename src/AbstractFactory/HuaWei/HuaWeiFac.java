package AbstractFactory.HuaWei;

import AbstractFactory.AbstractFac.PhoneProduct;
import AbstractFactory.AbstractFac.ProductFactory;
import AbstractFactory.AbstractFac.RouteProduct;

public class HuaWeiFac implements ProductFactory {
    @Override
    public PhoneProduct createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public RouteProduct createRoute() {
        return new HuaWeiRoute();
    }
}
