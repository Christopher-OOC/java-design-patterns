package org.example.behavioural.strategy;

public class CryptoCurrency implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("You are paying with crypto currency!");
    }

}
