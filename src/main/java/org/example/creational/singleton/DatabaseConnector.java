package org.example.creational.singleton;

public class DatabaseConnector {

    private static DatabaseConnector INSTANCE;

    private DatabaseConnector() {

    }

    public static DatabaseConnector getInstance() {
        if (INSTANCE == null) {
            synchronized (DatabaseConnector.class) {
                INSTANCE = new DatabaseConnector();
            }
        }

        return INSTANCE;
    }

    public void connect(){
        System.out.println("Database connected successfully");
    }
    public void disconnect(){
        System.out.println("Database disconnected successfully");
    }

}
