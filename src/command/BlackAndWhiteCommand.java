package command;

import command.framwork.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white filter added.");
    }
}
