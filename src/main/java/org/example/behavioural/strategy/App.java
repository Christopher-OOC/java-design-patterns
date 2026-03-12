package org.example.behavioural.strategy;

public class App {

    static void main() {

        /*
            - C for crypto
            - D for debit card
            - O online banking
         */

        String value = "D";

        PaymentManager manager = new PaymentManager();
        manager.setPaymentMethod(PaymentMethodFactory.getPaymentMethod(value));
        manager.pay(2000.00);
    }

}
