package commandpattern.newsletter.command;

import commandpattern.newsletter.command.Command;
import commandpattern.newsletter.service.MailService;

public class SendWelcomeMail implements Command {
    private MailService mailService;

    public SendWelcomeMail(MailService mailService) {
        this.mailService = mailService;
    }

    @Override
    public void execute() {
        mailService.prepareWelcomeMailTemplate();
        mailService.sendWelcomeMail();
    }
}