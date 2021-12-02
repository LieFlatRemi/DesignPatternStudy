package Composite;

public abstract class OrganizationComponent {
    protected String name;
    protected String des;

    public void add(OrganizationComponent oc){
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent oc){
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
