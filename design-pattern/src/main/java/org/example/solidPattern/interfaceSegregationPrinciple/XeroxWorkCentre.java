package org.example.solidPattern.interfaceSegregationPrinciple;

public class XeroxWorkCentre implements IPrint,IScan,IFax{

    @Override
    public void print() {
        System.out.println("Xerox printing...");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Xerox spool details...");
    }

    @Override
    public void scan() {
        System.out.println("Xerox scanning...");
    }

    @Override
    public void scanPhoto() {
        System.out.println("Xerox photo scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Xerox fax...");
    }

    @Override
    public void internetFax() {
        System.out.println("Xerox internet fax...");
    }
}
