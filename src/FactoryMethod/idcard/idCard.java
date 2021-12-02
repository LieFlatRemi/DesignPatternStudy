package FactoryMethod.idcard;

import FactoryMethod.framework.Product;

public class idCard extends Product {

    public idCard(String owner) {
        super(owner);
        System.out.println("制作" + owner + "的id卡");
    }

    public void use() {
        System.out.println("使用" + owner + "的id卡");
    }
}
