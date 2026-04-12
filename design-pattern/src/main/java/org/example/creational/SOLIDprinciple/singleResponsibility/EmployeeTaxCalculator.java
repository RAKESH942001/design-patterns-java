package org.example.creational.SOLIDprinciple.singleResponsibility;

public class EmployeeTaxCalculator {

    public void calculateTax( Employee employee){
        if (employee.getEmployeeType().equals("fulltime")) {
            System.out.println(employee.getEmployeeName()
                    + " is fulltime → Tax = 30%");
        } else if (employee.getEmployeeType().equals("contract")) {
            System.out.println(employee.getEmployeeName()
                    + " is contract → Tax = 10%");
        }
    }
}
