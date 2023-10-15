package commandpattern.newsletter.service;

public class MailService {
    public void prepareWelcomeMailTemplate() {
        System.out.println("Prepare welcome mail template");
    }

    public void sendWelcomeMail() {
        System.out.println("Send welcome mail to the subscribers");
    }
}