package org.example.creational.builder;

public class App {

    static void main() {
        Person person = new Person.Builder("Olojede", "abc@gmail.com").build();

        Student student = Student.builder()
                .id(1)
                .name("Olojede Olamide")
                .age(25)
                .build();

        Product product = Product
                .builder()
                .id(1)
                .name("Item 1")
                .price(23.0)
                .discount(12.5)
                .image("image.jpg")
                .build();

        System.out.println(product);
    }

}
