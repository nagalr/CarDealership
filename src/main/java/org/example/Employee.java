package org.example;

public class Employee {

    private String name;
    private String address;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
        if (finance) {
            creditHistory(customer, customer.getLoanAmount());
        } else if (vehicle.getPrice() < customer.getCashOnHand()) {
            processTransaction(customer, vehicle);
        } else System.out.println("Dear customer, please bring more Money!");
    }

    private void creditHistory(Customer customer, double loanAmaount) {
        System.out.println("Checking Credit History...");
    }

    private void processTransaction(Customer customer, Vehicle vehicle) {
        System.out.println("Processing Transaction");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
