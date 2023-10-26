package observer.newsletter.observer;

import observer.newsletter.observable.Subject;

public class IndividualSubscriber implements Observer {
    private String articleContent;
    private Subject newsletter;
    private String name;

    public IndividualSubscriber(String name, Subject newsletter) {
        this.newsletter = newsletter;
        this.name = name;
        this.newsletter.registerObserver(this);
    }

    public void update(String articleContent) {
        this.articleContent = articleContent;
        articleContentReceived();
    }

    public void articleContentReceived() {
        System.out.println("=======================");
        System.out.println("New Article Content received by " + this.name);
        System.out.println("Article name: " + this.articleContent);
        System.out.println("=======================");
        System.out.println();
    }
}
