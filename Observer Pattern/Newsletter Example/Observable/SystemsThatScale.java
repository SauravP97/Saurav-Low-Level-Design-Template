package observer.newsletter.observable;

import observer.newsletter.observable.Subject;
import observer.newsletter.observer.Observer;
import java.util.ArrayList;

public class SystemsThatScale implements Subject {
    private ArrayList<Observer> observers;
    private String articleContent;

    public SystemsThatScale() {
        observers = new ArrayList<>();    
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(articleContent);
        }
    }

    public void newArticlePublished(String articleContent) {
        this.articleContent = articleContent;
        notifyObservers();
    }
}
