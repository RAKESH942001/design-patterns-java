package org.example.behaviouralPattern.chainOfResponsibility;

public class Handler50 extends DenominationHandler{
    @Override
    public void handle(int amount) {
        if (amount >= 50) {
            int notes = amount / 50;
            int remaining = amount % 50;
            System.out.println("Dispensing " + notes + " x ₹50 note(s)");
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
