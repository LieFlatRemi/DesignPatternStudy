package Flyweight;

public class Hub implements NetWorkDevice {
    private String type;

    public Hub(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void use() {
        System.out.println("Linked Hub, name : " + getType());
    }
}
