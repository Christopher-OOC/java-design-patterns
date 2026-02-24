package org.example.creational.builder;

public class App {

    static void main() {
        Person person = new Person.Builder("Olojede", "abc@gmail.com").build();

        Student student = Student.builder()
                .id(1)
                .name("Olojede Olamide")
                .age(25)
                .build();

        System.out.println(student);
    }

}
