package commandpattern.newsletter.service;

public class MessageService {
    public void prepareAcknowledgementMessage() {
        System.out.println("Prepare acknowledgement message "
            + "mentioning the welcome mails are sent to the "
            + "subscribers");
    }

    public void sendAcknowledgement() {
        System.out.println("Send acknowledgement to the Author");
    }
}