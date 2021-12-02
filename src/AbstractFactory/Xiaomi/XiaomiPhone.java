package AbstractFactory.Xiaomi;

import AbstractFactory.AbstractFac.PhoneProduct;

public class XiaomiPhone implements PhoneProduct {
    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
