package org.example;

public class Dealership {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(5000, 2001);
        Employee employee = new Employee("May", "456 Main st.");
        Customer cust1 = new Customer("Jon", "123 Main st.", 12000, 0);

        cust1.purchaseCar(vehicle, employee, false);

    }
}

