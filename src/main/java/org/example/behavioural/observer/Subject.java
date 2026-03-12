package org.example.behavioural.observer;

public interface Subject {

    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyAllObserver();

}
