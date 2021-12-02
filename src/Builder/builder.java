package Builder;

public interface builder {
    //假设建造的四个步骤
    public abstract void Step01();
    public abstract void Step02();
    public abstract void Step03();
    public abstract void Step04();

    public abstract Product getProduct();
}
