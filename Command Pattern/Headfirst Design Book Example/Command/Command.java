package commandpattern.headfirst.command;

public interface Command {
    public void execute();

    public void undo();
}