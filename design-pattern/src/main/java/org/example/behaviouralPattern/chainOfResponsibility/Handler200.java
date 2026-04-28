package org.example.behaviouralPattern.chainOfResponsibility;

public class Handler200 extends DenominationHandler{
    @Override
    public void handle(int amount) {
        if (amount >= 200) {
            int notes = amount / 200;
            int remaining = amount % 200;
            System.out.println("Dispensing " + notes + " x ₹200 note(s)");
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
