package command;

import command.framwork.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resized this image.");
    }
}
