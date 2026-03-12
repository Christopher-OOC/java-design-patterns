package org.example.behavioural.observer.exercise;

public class BuyStockListener implements Observer {

    @Override
    public void update(float price) {
        if (price < 98) {
            System.out.println("Buying stock below: $" + price);
        }
    }
}
