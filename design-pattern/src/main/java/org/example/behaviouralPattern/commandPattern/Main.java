package org.example.behaviouralPattern.commandPattern;

public class Main {

    public static void main(String[] args) {
        // Create the Receiver
        Chef chef = new Chef();

        // Create the Commands
        Command pastaOrder = new OrderPastaCommand(chef);
        Command soupOrder = new OrderSoupCommand(chef);

        // Create the Invoker
        Waiter waiter = new Waiter();

        // Place orders
        waiter.takeOrder(pastaOrder);
        waiter.takeOrder(soupOrder);

        // Undo last order
        waiter.undoLastOrder();
    }
}
