package commandpattern.newsletter.command;

import commandpattern.newsletter.command.Command;
import commandpattern.newsletter.service.UserService;

public class CollectSubscriberEmails implements Command {
    private UserService userService;

    public CollectSubscriberEmails(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void execute() {
        userService.readUsersFromDb();
        userService.filterSubscribers();
        userService.snedSubscribersDataToMailService();    
    }
}