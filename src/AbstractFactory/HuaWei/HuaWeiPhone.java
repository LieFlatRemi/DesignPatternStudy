package AbstractFactory.HuaWei;

import AbstractFactory.AbstractFac.PhoneProduct;

public class HuaWeiPhone implements PhoneProduct {
    @Override
    public void start() {
        System.out.println("huawei手机开机");
    }

    @Override
    public void close() {
        System.out.println("huawei手机关机");
    }

    @Override
    public void call() {
        System.out.println("huawei手机打电话");
    }
}
