package AbstractFactory.Xiaomi;

import AbstractFactory.AbstractFac.RouteProduct;

public class XiaomiRoute implements RouteProduct {
    @Override
    public void start() {
        System.out.println("小米路由开机");
    }

    @Override
    public void close() {
        System.out.println("小米路由关机");
    }

    @Override
    public void wifi() {
        System.out.println("小米路由开启wifi");
    }
}
