package AdapterPattern;

//对象适配器：adaptee 作成员
public class ObjectAdapter {
    public static void main(String[] args) {
        Computer computer = new Computer();
        NetToUsb usb = new Adapter2();
        computer.useInternet(usb);
    }
}

class Adapter2 implements NetToUsb{
    private Adaptee adaptee;

    public Adapter2(){
        adaptee = new Adaptee();
    }

    @Override
    public void connect() {
        adaptee.linkInternet();
    }
}
