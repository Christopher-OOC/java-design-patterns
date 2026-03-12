package org.example.behavioural.observer.practice;

public class App {

    static void main() {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber subscriber1 = new Subscriber("Chris");
        Subscriber subscriber2 = new Subscriber("Larry");

        channel.addObserver(subscriber1);
        channel.addObserver(subscriber2);

        channel.addPost("my profile");
    }

}
