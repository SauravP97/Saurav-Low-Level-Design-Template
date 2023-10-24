package observer.headfirst.actual.observable;

import observer.headfirst.actual.observer.Observer;

public interface Observable {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}