package ChainOfResponsibility;

public class DepartmentHandler extends Handler {
    public DepartmentHandler(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getPrice() <= 5000) {           //当前处理
            System.out.println("id = " + request.getId() + "的请求被系：" + this.name + "处理");
        } else {                                    //交给下一个处理者处理
            handler.handleRequest(request);
        }
    }
}
