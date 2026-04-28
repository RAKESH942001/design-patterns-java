package org.example.behaviouralPattern.chainOfResponsibility;

public class Handler500 extends DenominationHandler{
    @Override
    public void handle(int amount) {
        if (amount >= 500) {
            int notes = amount / 500;
            int remaining = amount % 500;
            System.out.println("Dispensing " + notes + " x ₹500 note(s)");
            if (remaining > 0 && next != null) {
                next.handle(remaining);
            }
        } else {
            if (next != null) {
                next.handle(amount);
            }
        }
    }
}
