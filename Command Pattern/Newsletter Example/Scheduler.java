package commandpattern.newsletter;

import commandpattern.newsletter.command.Command;
import java.util.Queue;
import java.util.LinkedList;

public class Scheduler {
    private Queue<Command> scheduler;

    public Scheduler() {
        scheduler = new LinkedList<Command>();
    }

    public void scheduleRequest(Command command) {
        scheduler.add(command);
    }

    public void executeScheduledRequest() {
        if (scheduler.isEmpty()) {
            System.out.println("No requests to execute!");
            return;
        }

        Command command = scheduler.remove();
        System.out.println();
        System.out.println("==========================");
        command.execute();
        System.out.println("==========================");
        System.out.println();
    }
}