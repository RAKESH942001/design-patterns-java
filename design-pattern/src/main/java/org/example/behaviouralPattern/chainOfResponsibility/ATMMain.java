package org.example.behaviouralPattern.chainOfResponsibility;

public class ATMMain {
    public static void main(String[] args) {

        // Step 1: create all handlers
        DenominationHandler h500 = new Handler500();
        DenominationHandler h200 = new Handler200();
        DenominationHandler h100 = new Handler100();
        DenominationHandler h50  = new Handler50();

        h500.setNext(h200);
        h200.setNext(h100);
        h100.setNext(h50);

        // Step 3: client just sends to first handler
        System.out.println("--- Withdrawing ₹750 ---");
        h500.handle(750);

        System.out.println("--- Withdrawing ₹1300 ---");
        h500.handle(1300);
    }
}
