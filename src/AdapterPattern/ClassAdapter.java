package AdapterPattern;

//类适配器

public class ClassAdapter {
    public static void main(String[] args) {
        NetToUsb usb = new Adapter();
        Computer computer = new Computer();
        computer.useInternet(usb);
    }
}
/*
*   案例：电脑连接网线上网，电脑不能直连网线，需要加一个usb
*/
//电脑
class Computer{
    public void useInternet(NetToUsb usb){
        usb.connect();
    }
}
//适配器接口
interface NetToUsb {
    public void connect();
}
//网线
class Adaptee {
    public void linkInternet() {
        System.out.println("连接上互联网");
    }
}
//适配器usb
class Adapter extends Adaptee implements NetToUsb  {
    @Override
    public void connect() {
        super.linkInternet();
    }
}