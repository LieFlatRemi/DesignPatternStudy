package CommandPattern;

public interface Command {
    public void execute();          //执行动作
    public void undo();             //撤销动作
}
