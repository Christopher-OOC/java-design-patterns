package org.example.behavioural.observer.exercise;

public interface Subject {

    public void addObserver(Observer o);
    public void notifyAllObserver();

}
