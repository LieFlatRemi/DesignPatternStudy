package AbstractFactory;

import AbstractFactory.AbstractFac.*;
import AbstractFactory.HuaWei.HuaWeiFac;
import AbstractFactory.Xiaomi.XiaomiFac;

public class Main {
    public static void main(String[] args) {
        ProductFactory xiaomiFac = new XiaomiFac();
        ProductFactory huaweiFac = new HuaWeiFac();
        PhoneProduct xiaomiPhone = xiaomiFac.createPhone();
        RouteProduct huaweiRoute = huaweiFac.createRoute();
        xiaomiPhone.start();
        huaweiRoute.wifi();
    }
}
