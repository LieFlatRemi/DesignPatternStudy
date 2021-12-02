package FactoryMethod.framework;

public abstract class Product {
    protected String owner;
    public Product(String owner){
        this.owner = owner;
    }
    public abstract void use();
}
