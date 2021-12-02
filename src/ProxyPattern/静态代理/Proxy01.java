package ProxyPattern.静态代理;

public class Proxy01 implements Rent{
    private Host host;

    public Proxy01(Host host) {
        this.host = host;
    }

    @Override
    public void rent(){
        host.rent();
        seeHouse();
        fare();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void fare(){
        System.out.println("中介收中介费");
    }
}
