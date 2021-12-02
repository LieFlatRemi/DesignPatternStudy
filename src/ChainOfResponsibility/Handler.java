package ChainOfResponsibility;

public abstract class Handler {
    protected Handler handler;      //下一个处理者
    protected String name;

    public Handler(String name) {
        this.name = name;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(Request request);
}
