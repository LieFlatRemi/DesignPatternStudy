package CommandPattern;

public class Invoker {
    private CommandQueue commandQueue;

    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void callSingleCommand(int index){
        commandQueue.getCommand(index).execute();
    }
    //业务方法，用于调用命令类的方法
    public void call(){
        commandQueue.execute();
    }
}

