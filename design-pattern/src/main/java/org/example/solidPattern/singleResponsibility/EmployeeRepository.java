package org.example.solidPattern.singleResponsibility;

public class EmployeeRepository {
    public void save(Employee employee) {
        // Simulating DB save
        System.out.println("Saving employee to DB: "
                + employee.getEmployeeName());
    }
    }

