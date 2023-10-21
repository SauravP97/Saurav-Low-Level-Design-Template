package commandpattern.newsletter;

import commandpattern.newsletter.command.CollectSubscriberEmails;
import commandpattern.newsletter.command.SendAcknowledgementMessage;
import commandpattern.newsletter.command.SendWelcomeMail;
import commandpattern.newsletter.command.MacroCommand;
import commandpattern.newsletter.command.Command;
import commandpattern.newsletter.service.UserService;
import commandpattern.newsletter.service.MailService;
import commandpattern.newsletter.service.MessageService;
import commandpattern.newsletter.Scheduler;

public class SchedulerTest {
    public static void main(String[] args) {
        UserService userService = new UserService();
        MailService mailService = new MailService();
        MessageService messageService = new MessageService();

        CollectSubscriberEmails collectEmailCommand 
            = new CollectSubscriberEmails(userService);
        SendWelcomeMail sendWelcomeMail 
            = new SendWelcomeMail(mailService);
        SendAcknowledgementMessage sendAcknowledgementMessage 
            = new SendAcknowledgementMessage(messageService);

        Scheduler scheduler = new Scheduler();

        // scheduler.scheduleRequest(collectEmailCommand);
        // scheduler.scheduleRequest(sendWelcomeMail);
        // scheduler.scheduleRequest(sendAcknowledgementMessage);

        // scheduler.executeScheduledRequest();
        // scheduler.executeScheduledRequest();
        // scheduler.executeScheduledRequest();

        Command[] commands = {collectEmailCommand, sendWelcomeMail, sendAcknowledgementMessage};
        MacroCommand macroCommand = new MacroCommand(commands);

        scheduler.scheduleRequest(macroCommand);
        scheduler.executeScheduledRequest();


    }
}