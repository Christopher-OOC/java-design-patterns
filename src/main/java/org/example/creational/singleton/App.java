package org.example.creational.singleton;

public class App {

    static void main() {
        DatabaseConnector.getInstance().connect();

        MySingleton mySingleton1 = MySingleton.INSTANCE;
        MySingleton mySingleton3 = MySingleton.INSTANCE;

        System.out.println(mySingleton1 == mySingleton3);

    }

}
