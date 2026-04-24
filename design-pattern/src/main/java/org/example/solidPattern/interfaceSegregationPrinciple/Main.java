package org.example.solidPattern.interfaceSegregationPrinciple;

public class Main {
    public static void main(String[] args) {
        // Xerox (all features)
        XeroxWorkCentre xerox = new XeroxWorkCentre();
        xerox.print();
        xerox.scan();
        xerox.fax();

        System.out.println("-----");

        // HP (print + scan only)
        HPPrinterNScanner hp = new HPPrinterNScanner();
        hp.print();
        hp.scan();

        System.out.println("-----");

        // Canon (only print)
        CanonPrinter canon = new CanonPrinter();
        canon.print();
    }
}
