package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.idCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new idCardFactory();
        Product p1 = factory.create("皮皮");
        Product p2 = factory.create("Remi");
        p1.use();
        p2.use();
     }
}
