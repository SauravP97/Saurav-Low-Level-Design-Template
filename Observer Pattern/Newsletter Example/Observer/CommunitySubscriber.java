package observer.newsletter.observer;

import observer.newsletter.observable.Subject;

public class CommunitySubscriber implements Observer {
    private String articleContent;
    private Subject newsletter;
    private String name;

    public CommunitySubscriber(String name, Subject newsletter) {
        this.newsletter = newsletter;
        this.name = name;
        this.newsletter.registerObserver(this);
    }

    public void update(String articleContent) {
        this.articleContent = articleContent;
        sendToCommunityMembers();
    }

    public void sendToCommunityMembers() {
        System.out.println("=======================");
        System.out.println(
            this.name + 
            " is sending the article content to all the community members");
        System.out.println("Article name: " + this.articleContent);
        System.out.println("=======================");
        System.out.println();
    }
}
