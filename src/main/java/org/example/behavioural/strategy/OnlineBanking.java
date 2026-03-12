package org.example.behavioural.strategy;

public class OnlineBanking implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("You are paying with online banking!");
    }
}
