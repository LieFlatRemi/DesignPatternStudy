package CommandPattern;


import java.util.ArrayList;
import java.util.List;

//命令队列类，用List存储要执行的一系列命令
public class CommandQueue {
    private List<Command> commandList;

    public CommandQueue() {
        commandList = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public Command getCommand(int index) {
        return commandList.get(index);
    }

    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
