package org.example.solidPattern.singleResponsibility;

public class Main {

    public static void main(String[] args) {


        // Create employees
        Employee emp1 = new Employee("E001", "Arjun",
                "Mumbai", "9876543210", "fulltime");

        Employee emp2 = new Employee("E002", "Priya",
                "Pune", "9123456780", "contract");

        // Class 2 — EmployeeRepository handles saving
        EmployeeRepository repository = new EmployeeRepository();
        repository.save(emp1);
        repository.save(emp2);

        System.out.println("----------------------------");

        // Class 3 — EmployeeTaxCalculator handles tax
        EmployeeTaxCalculator taxCalculator = new EmployeeTaxCalculator();
        taxCalculator.calculateTax(emp1);
        taxCalculator.calculateTax(emp2);
    }
}
