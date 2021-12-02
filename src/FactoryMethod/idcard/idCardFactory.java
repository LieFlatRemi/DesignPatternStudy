package FactoryMethod.idcard;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class idCardFactory extends Factory {
    List<Product> list = new ArrayList<>();

    @Override
    public Product createProduct(String owner) {
        return new idCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        list.add(product);
    }

    public List<Product> getList(){
        return list;
    }
}
