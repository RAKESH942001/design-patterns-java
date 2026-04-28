package org.example.behaviouralPattern.chainOfResponsibility;

public class Handler100 extends DenominationHandler{
    @Override
    public void handle(int amount) {
        if (amount >= 100) {
            int notes = amount / 100;
            int remaining = amount % 100;
            System.out.println("Dispensing " + notes + " x ₹100 note(s)");
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
