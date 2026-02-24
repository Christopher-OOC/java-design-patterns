package org.example.creational.singleton;

public enum MySingleton {

    INSTANCE;

    MySingleton() {}

    public void connect(String url) {
        System.out.println("Connecting to " + url);
    }

}
