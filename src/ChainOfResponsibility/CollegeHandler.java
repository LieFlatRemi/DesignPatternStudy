package ChainOfResponsibility;

public class CollegeHandler extends Handler {
    public CollegeHandler(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getPrice() <= 10000) {
            System.out.println("id = " + request.getId() + "的请求被学院：" + this.name + "处理");
        } else {
            handler.handleRequest(request);
        }
    }
}
