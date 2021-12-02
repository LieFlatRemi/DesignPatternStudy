package AbstractFactory.HuaWei;

import AbstractFactory.AbstractFac.RouteProduct;

public class HuaWeiRoute implements RouteProduct {

    @Override
    public void start() {
        System.out.println("huawei路由器开机");
    }

    @Override
    public void close() {
        System.out.println("huawei路由器关机");
    }

    @Override
    public void wifi() {
        System.out.println("huawei路由器开启wifi");
    }
}
