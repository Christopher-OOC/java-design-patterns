package org.example.behavioural.strategy;

public class DebitCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("You are paying with debt card!");
    }
}
