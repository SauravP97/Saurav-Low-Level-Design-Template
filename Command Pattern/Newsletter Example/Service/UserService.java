package commandpattern.newsletter.service;

public class UserService {
    public void readUsersFromDb() {
        System.out.println("Collect user rows from "
            + "the User table in database");
    }

    public void filterSubscribers() {
        System.out.println("Filter the unsubscribed "
            + "users from the collected user rows");
    }

    public void snedSubscribersDataToMailService() {
        System.out.println("Send filtered subscriber details "
            + "to the mail service");
    }
}