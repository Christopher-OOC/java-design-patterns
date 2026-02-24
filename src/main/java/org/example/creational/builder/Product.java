package org.example.creational.builder;

public class Product {

    private int id;
    private String name;
    private double price;
    private double discount;
    private String image;

    private Product(Builder builder) {

        this.id = builder.id;
        this.name = builder.name;
        this.price = builder.price;
        this.discount = builder.discount;
        this.image = builder.image;

    }

    public static class Builder {

        private int id;
        private String name;
        private double price;
        private double discount;
        private String image;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder discount(double discount) {
            this.discount = discount;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", image='" + image + '\'' +
                '}';
    }
}
