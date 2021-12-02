package ProxyPattern.静态代理;

//房东
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东想出租房子");
    }
}
