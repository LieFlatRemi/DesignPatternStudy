package Builder;

public class Director {
    public Product build(builder builder){
        builder.Step01();
        builder.Step02();
        builder.Step03();
        builder.Step04();
        return builder.getProduct();
    }
}
