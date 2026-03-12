package org.example.creational.prototype;

public class App {

    static void main() throws CloneNotSupportedException {
        Shape circle = new Circle();
        circle.setWidth(10);
        circle.setHeight(20);
        circle.setColor("Green");

        System.out.println(circle);

        Shape circle2 = circle.clone();
        circle2.setColor("Blue");

        System.out.println(circle2);
    }

}
