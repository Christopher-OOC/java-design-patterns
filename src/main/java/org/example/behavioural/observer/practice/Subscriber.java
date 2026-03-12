package org.example.behavioural.observer.practice;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println(this.name + ", someone has posted: " + message);
    }
}
