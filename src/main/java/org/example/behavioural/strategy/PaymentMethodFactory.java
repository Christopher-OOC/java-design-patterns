package org.example.behavioural.strategy;

public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(String value) {
        return switch (value) {
            case "C" -> new CryptoCurrency();
            case "D" -> new DebitCard();
            case "O" -> new OnlineBanking();
            default -> null;
        };
    }
}
