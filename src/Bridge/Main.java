package Bridge;

public class Main {
    public static void main(String[] args) {
        //戴尔笔记本
        Computer c1 = new Laptop(new Dell());
        //联想台式机
        Computer c2 = new Desktop(new Lenovo());

        c1.info();
        c2.info();
    }
}
