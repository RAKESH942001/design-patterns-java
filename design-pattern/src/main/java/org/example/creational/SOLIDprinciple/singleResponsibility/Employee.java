package org.example.creational.SOLIDprinciple.singleResponsibility;

public class Employee {

    private String employeeId;
    private String employeeName;
    private String employeeAddress;
    private String contactNumber;
    private String employeeType;


    public Employee(String employeeId, String employeeName,
                    String employeeAddress, String contactNumber,
                    String employeeType) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.contactNumber = contactNumber;
        this.employeeType = employeeType;
    }


    // Getters
    public String getEmployeeId()      { return employeeId; }
    public String getEmployeeName()    { return employeeName; }
    public String getEmployeeAddress() { return employeeAddress; }
    public String getContactNumber()   { return contactNumber; }
    public String getEmployeeType()    { return employeeType; }



}
