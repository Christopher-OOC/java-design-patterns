package org.example.creational.builder;

public class Person {

    private final String name;
    private final String email;

    private String address;
    private String university;
    private int age;

    private Person(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
        this.university = builder.university;
        this.age = builder.age;
    }

    public static class Builder {
        private String name;
        private String email;

        private String address;
        private String university;
        private int age;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                '}';
    }
}
