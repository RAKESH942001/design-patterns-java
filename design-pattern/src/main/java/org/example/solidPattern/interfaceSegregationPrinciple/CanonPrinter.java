package org.example.solidPattern.interfaceSegregationPrinciple;

public class CanonPrinter implements IPrint{

    @Override
    public void print() {
        System.out.println("Canon printing...");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Canon spool details...");
    }
}
