package commandpattern.newsletter.command;

import commandpattern.newsletter.command.Command;
import commandpattern.newsletter.service.MessageService;

public class SendAcknowledgementMessage implements Command {
    private MessageService messageService;

    public SendAcknowledgementMessage(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void execute() {
        messageService.prepareAcknowledgementMessage();
        messageService.sendAcknowledgement();  
    }
}