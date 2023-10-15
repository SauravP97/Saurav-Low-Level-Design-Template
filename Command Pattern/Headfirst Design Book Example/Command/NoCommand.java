package commandpattern.headfirst.command;

public class NoCommand implements Command {
    @Override
    public void execute() {}

    @Override
    public void undo() {}
}