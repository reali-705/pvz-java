package ufpa.icen.pvz.view.input;


import java.util.Queue;
import java.util.LinkedList;
public class InputHandler {
    private final Queue<InputCommand> commandQueue;
    public InputHandler() {
        this.commandQueue = new LinkedList<>();
    }
}
    public void addCommand(InputCommand command) {
        commandQueue.add(command);
    }
    
    public InputCommand removeCommand() {
        return commandQueue.poll();
    }
    
    public boolean hasCommands() {
        return !commandQueue.isEmpty();
    }
}
