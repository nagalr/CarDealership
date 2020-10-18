package org.example;

public class Customer {

    private String name;
    private String address;
    private double cashOnHand;
    private double loanAmount;


    public Customer(String name, String address, double cashOnHand, double loanAmount) {
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;
        this.loanAmount = loanAmount;
    }

    public String purchaseCar(Vehicle vehicle, Employee employee, boolean needALoan) {
        System.out.println("Purchasing a Car.");
        return "Purchasing a Car.";
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

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
}
