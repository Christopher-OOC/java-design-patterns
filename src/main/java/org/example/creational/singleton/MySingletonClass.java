package org.example.creational.singleton;

public class MySingletonClass {

    private static MySingletonClass INSTANCE;

    public static MySingletonClass getInstance() {
        if (INSTANCE == null) {
            synchronized (MySingletonClass.class) {
               INSTANCE = new MySingletonClass();
            }
        }

        return INSTANCE;
    }

    private MySingletonClass() {}

}
