package org.example.behaviouralPattern.strategy;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // Pay with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(1500.00);

        // Switch to PayPal at runtime
        cart.setPaymentStrategy(new PayPalPayment("rakesh@gmail.com"));
        cart.checkout(899.00);

        // Switch to UPI at runtime
        cart.setPaymentStrategy(new UPIPayment("rakesh@upi"));
        cart.checkout(299.00);
    }
}
