package org.example.behaviouralPattern.chainOfResponsibility;



public abstract  class  DenominationHandler {

    protected DenominationHandler next;

    public void setNext(DenominationHandler next) {
        this.next = next;
    }
    public abstract void handle(int amount);


}

