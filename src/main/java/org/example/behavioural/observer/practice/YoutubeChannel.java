package org.example.behavioural.observer.practice;


import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    private String message;
    private List<Observer> observers;

    public YoutubeChannel() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.receiveNotification(message);
        }
    }

    public void addPost(String post) {
        this.message = post;
        notifyAllObservers();
    }
}
