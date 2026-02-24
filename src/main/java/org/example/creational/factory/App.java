package org.example.creational.factory;

public class App {

    static void main() {
        Animal animal = AnimalFactory.getAnimal(AnimalType.CAT);
        animal.eat();

    }

}
