package org.example.behavioural.observer.exercise;

public class App {

    static void main() {
        StockExchange stockExchange = new StockExchange();

        BuyStockListener buyStockListener = new BuyStockListener();
        SellStockListener sellStockListener = new SellStockListener();

        stockExchange.addObserver(buyStockListener);
        stockExchange.addObserver(sellStockListener);

        stockExchange.start();
    }

}
