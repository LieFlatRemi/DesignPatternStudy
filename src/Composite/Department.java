package Composite;

//Department相当于Leaf叶子节点， 不需要重写add和remove方法
public class Department extends OrganizationComponent{
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println("Department{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}');
    }
}
