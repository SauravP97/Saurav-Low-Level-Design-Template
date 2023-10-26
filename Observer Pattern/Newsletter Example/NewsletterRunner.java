package observer.newsletter;

import observer.newsletter.observer.Observer;
import observer.newsletter.observer.IndividualSubscriber;
import observer.newsletter.observer.CommunitySubscriber;
import observer.newsletter.observable.Subject;
import observer.newsletter.observable.SystemsThatScale;

public class NewsletterRunner {
    public static void main(String[] args) {
        SystemsThatScale newsletter = new SystemsThatScale();

        // Alex and Max are subscribed to the newsletter. 
        Observer alex = new IndividualSubscriber("Alex", newsletter);
        Observer max = new IndividualSubscriber("Max", newsletter);

        // GeekForces organisation is subscribed to the newsletter.
        Observer geeksForces = new CommunitySubscriber("Geeks Force", newsletter);
    
        // New Article is published and all the subscribers are notified.
        newsletter.newArticlePublished("Observer Pattern explained");

        // Max unsubscribes from the newsletter
        newsletter.removeObserver(max);

        // New Article is published and all the subscribers are notified.
        newsletter.newArticlePublished("Factory Pattern explained");
    }
}