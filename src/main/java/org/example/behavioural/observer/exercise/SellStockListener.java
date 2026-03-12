package org.example.behavioural.observer.exercise;

public class SellStockListener implements Observer {

    @Override
    public void update(float price) {
        if (price > 104) {
            System.out.println("Selling stock above $" + price);
        }
    }
}
