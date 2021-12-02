package ChainOfResponsibility;

public class MasterHandler extends Handler{
    public MasterHandler(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("id = " + request.getId() + "的请求被校长：" + this.name + "处理");
    }
}
