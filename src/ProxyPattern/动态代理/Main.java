package ProxyPattern.动态代理;

public class Main {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色
        Proxy02 proxy02 = new Proxy02();
        proxy02.setRent(host);

        Rent proxy = (Rent) proxy02.getProxy();

        proxy.rent();
    }
}
