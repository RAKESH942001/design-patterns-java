package org.example.creational.interfaceSegregationPrinciple;

public class HPPrinterNScanner implements IScan,IPrint{

    @Override
    public void print() {
        System.out.println("HP printing...");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("HP spool details...");
    }

    @Override
    public void scan() {
        System.out.println("HP scanning...");
    }

    @Override
    public void scanPhoto() {
        System.out.println("HP photo scanning...");
    }
}
