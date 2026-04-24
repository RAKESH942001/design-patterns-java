package org.example.solidPattern.openClosePriniciple;

public class main {
    public static void main(String[] args) {


        InsurancePremiumDiscountCalculator calculator=new InsurancePremiumDiscountCalculator();

        CustomerProfile healthCustomer=new HealthInsuranceCustomerProfile();
        int healthDiscount=calculator.calculatePremiumDiscountPercent(healthCustomer);
        System.out.println("Health Customer Loyal: " + healthCustomer.isLoyalCustomer());
        System.out.println("Health Insurance Discount: " + healthDiscount + "%");

        System.out.println("----------------------------");

        // Vehicle Insurance Customer
        CustomerProfile vehicleCustomer = new VehicleInsuranceCustomerProfile();
        int vehicleDiscount = calculator.calculatePremiumDiscountPercent(vehicleCustomer);
        System.out.println("Vehicle Customer Loyal: " + vehicleCustomer.isLoyalCustomer());
        System.out.println("Vehicle Insurance Discount: " + vehicleDiscount + "%");

    }
}
