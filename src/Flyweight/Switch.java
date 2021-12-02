package Flyweight;

public class Switch implements NetWorkDevice {
    private String type;

    public Switch(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked Switch, name : " + getType());
    }

}
